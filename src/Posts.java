

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class Posts {
	@Id
	@GeneratedValue(generator = "id_gen2")
	@GenericGenerator(name = "id_gen2", strategy = "uuid2")
	String id;
	
	String message;

    Date messageDate;

	@OneToOne
	@JoinColumn(name="user")
   User user;
    
	@OneToOne
	@JoinColumn(name="group")
    Groups sd;

	public Posts() {
		super();
	}
	
	

	public Date getMessageDate() {
		return messageDate;
	}



	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}



	public Posts(String message) {
		super();
		this.message = message;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Groups getSd() {
		return sd;
	}

	public void setSd(Groups sd) {
		this.sd = sd;
	}
	
	
}
