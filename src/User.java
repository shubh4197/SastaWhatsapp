

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User {
	@Id
	@GeneratedValue(generator = "id_gen2")
	@GenericGenerator(name = "id_gen2", strategy = "uuid2")
	@Column(name="User_ID")
	String id;
	String fname;
	String lname;
	String email;
	String password;
	
	@OneToMany(cascade=CascadeType.ALL)
    List<Posts> post;
	
	@ManyToMany(cascade=CascadeType.ALL)
	List<Groups> group;
   
	

	public User() {
		super();
	}

	public User(String fname, String lname, String email, String password) {
		super();

		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Posts> getPost() {
		return post;
	}

	public void setPost(List<Posts> post) {
		this.post = post;
	}

	public List<Groups> getGroup() {
		return group;
	}

	public void setGroup(List<Groups> group) {
		this.group = group;
}

}
