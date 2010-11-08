package conf.server;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;
@PersistenceCapable
public class Submissions {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;
	@Persistent
	private int conf_id; 
	@Persistent
	private String article_name;
	@Persistent
	private String annotation;
	@Persistent
	private String article_pre_rw; 
	@Persistent
	String article_post;
	@Persistent
	String abstract_rw;
	@Persistent
	int cancelled;
	@Persistent
	String cr_date;
	@Persistent
	int created_by;
	@Persistent
	String last_update; 
	@Persistent
	int last_updated_by;
	
	
}
