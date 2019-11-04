

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;




public class doa {
	private EntityManagerFactory Factory;

	public void addUser(User s) {
		Factory = HibernateOGMUtil.getEntityManagerFactory();
		EntityManager em = Factory.createEntityManager();

		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
	}
	
	public int validate(String value,String pass) {
		Factory = HibernateOGMUtil.getEntityManagerFactory();
		EntityManager em = Factory.createEntityManager();
        
		User us=em.createQuery("select s from User s where email= :email",User.class).setParameter("email",value).getResultList().get(0);
		if(us.password.equals(pass))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public User findall(String value) {
		Factory = HibernateOGMUtil.getEntityManagerFactory();
		EntityManager em = Factory.createEntityManager();
		User us=em.createQuery("select s from User s where s.email= :email",User.class).setParameter("email",value).getResultList().get(0);
		return us;
	}
	
	
	public Groups findGroup(String value) {
		Factory = HibernateOGMUtil.getEntityManagerFactory();
		EntityManager em = Factory.createEntityManager();
		Groups us=em.createQuery("select s from Groups s where s.gname= :email",Groups.class).setParameter("email",value).getResultList().get(0);
		return us;
	}
	
   public List<User> findallUsers() {
	   Factory = HibernateOGMUtil.getEntityManagerFactory();
		EntityManager em = Factory.createEntityManager();
		List<User> us=em.createQuery("select s from User s ",User.class).getResultList();
		return us;
   }
   
   public List<User> addMembers(String[] values){
	   Factory = HibernateOGMUtil.getEntityManagerFactory();
		EntityManager em = Factory.createEntityManager();
		List<User> sd=new ArrayList<>();
		for(String i:values) {
			User us=em.createQuery("select s from User s where s.fname= :name",User.class).setParameter("name",i).getResultList().get(0);
            sd.add(us);		
		}
	   return sd;
   }
   
   public void addtoGroup(Groups gh,List<User> value) {
	   Factory = HibernateOGMUtil.getEntityManagerFactory();
		EntityManager em = Factory.createEntityManager();
		for(User us:value)
		{
		User u=em.createQuery("select u from User u where u.email= :email",User.class).setParameter("email", us.email).getResultList().get(0);
		List<Groups> sd=u.getGroup();
		System.out.println(sd);
		sd.add(gh);
 		u.setGroup(sd);
		}
		em.getTransaction().begin();
		em.persist(gh);
		em.getTransaction().commit();
   }
   
   public List<Groups> showGroups(String value) {
	   Factory = HibernateOGMUtil.getEntityManagerFactory();
		EntityManager em = Factory.createEntityManager();
		User u=em.createQuery("select u from User u where u.email= :email",User.class).setParameter("email", value).getResultList().get(0);
		return u.group;
   }
   
   public void chats(Posts ps,String value,String group) {
	   Factory = HibernateOGMUtil.getEntityManagerFactory();
		EntityManager em = Factory.createEntityManager();
		User u=em.createQuery("select u from User u where u.email= :email",User.class).setParameter("email", value).getResultList().get(0);
		List<Posts> sd=u.getPost();
		sd.add(ps);
		u.setPost(sd);
		Groups gs=em.createQuery("select g from Groups g where g.gname= :name",Groups.class).setParameter("name",group).getResultList().get(0);
        List<Posts> fd=gs.getPosts(); 
        fd.add(ps);
        gs.setPosts(fd);
        em.getTransaction().begin();
        em.persist(ps);
        em.getTransaction().commit();
   }
   
   public List<Posts> fetchChats(String value){
	    Factory = HibernateOGMUtil.getEntityManagerFactory();
		EntityManager em = Factory.createEntityManager();
		Groups messages=em.createQuery("select s from Groups s where gname= :name",Groups.class).setParameter("name", value).getResultList().get(0);
        List<Posts> sd=messages.getPosts();
        Collections.sort(sd,new DateComparator());
        return sd;
   }
}
