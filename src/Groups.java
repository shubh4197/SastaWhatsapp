

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class Groups {
	@Id
	@GeneratedValue(generator = "id_gen2")
	@GenericGenerator(name = "id_gen2", strategy = "uuid2")
	@Column(name="Group_ID")
	String id;
    String gname;
	
    
    @ManyToMany
    List<User> users;
	
    @OneToMany(cascade=CascadeType.ALL)
    @OrderBy
    List<Posts> posts;
	
	public Groups() {
		super();
	}
	public Groups(String gname,List<User> users) {
		super();
		this.gname = gname;
		this.users=users;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public List<Posts> getPosts() {
		return posts;
	}
	public void setPosts(List<Posts> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		return "Groups [id=" + id + ", gname=" + gname + ", users=" + users + ", posts=" + posts + "]";
	}
	
	
	
}
