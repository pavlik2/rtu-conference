package conf.server;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;
@PersistenceCapable
public class Conferences {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;
	@Persistent
	private 	int nr;
	@Persistent
	private 	int appl_sub_date; 
	@Persistent
	private 	int appl_upl_date; 
	@Persistent
	private 	int conf_date;
	@Persistent
	private 	int cr_date;
	@Persistent
	private 	int upd_date; 
	
	
}
