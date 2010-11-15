package conf.server;

import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Text;

@PersistenceCapable
public class People {
	public People(String pK, String name, String last_name, String email,
			String phonenr, String post, String degree, String work_place) {
	//	super();
		PK = pK;
		this.name = name;
		this.last_name = last_name;
		this.email = email;
		this.phonenr = phonenr;
		this.post = post;
		Degree = degree;
		this.work_place = work_place;
	}
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;
	@Persistent
	private String PK;
	@Persistent
	private String name;
	@Persistent
	private	String last_name;
	private	@Persistent
	String email;
	@Persistent
	private	String phonenr;
	@Persistent
	private	String post;
	@Persistent
	private	String Degree;
	@Persistent
	private	String work_place;
	public Key getId() {
		return id;
	}
	public void setId(Key id) {
		this.id = id;
	}
	public String getPK() {
		return PK;
	}
	public void setPK(String pK) {
		PK = pK;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenr() {
		return phonenr;
	}
	public void setPhonenr(String phonenr) {
		this.phonenr = phonenr;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public String getWork_place() {
		return work_place;
	}
	public void setWork_place(String work_place) {
		this.work_place = work_place;
	}

}
