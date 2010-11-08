package conf.server;

import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Text;

@PersistenceCapable
public class People {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;
	@Persistent
	private String PK;
	@Persistent
	private String name;
	@Persistent
	String last_name;
	@Persistent
	String email;
	@Persistent
	String phonenr;
	@Persistent
	String post;
	@Persistent
	String Degree;
	@Persistent
	String work_place;

}
