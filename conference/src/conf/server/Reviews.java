package conf.server;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;
@PersistenceCapable
public class Reviews {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;
	@Persistent
	private int reviewer_id;
	@Persistent
	private int submission_id; 
	@Persistent
	private int total_summary; 
	@Persistent
	private 	int reccomendations; 
	@Persistent
	private 	String comments_for_a;
	@Persistent
	private String absr_comm;
	@Persistent
	private Boolean  submitted;
	@Persistent
	private 	Boolean approved;
	@Persistent
	private 	int cr_date; 
	@Persistent
	private 	int cr_by;
	@Persistent
	private 	int last_update_date;
	@Persistent
	private 	int last_updated_by; 
	
	
	

}
