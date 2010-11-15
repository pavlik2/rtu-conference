package conf.server;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;
@PersistenceCapable
public class Conferences {
	public Conferences(int nr, int appl_sub_date, int appl_upl_date,
			int conf_date, int cr_date, int upd_date) {
		//super();
		this.nr = nr;
		this.appl_sub_date = appl_sub_date;
		this.appl_upl_date = appl_upl_date;
		this.conf_date = conf_date;
		this.cr_date = cr_date;
		this.upd_date = upd_date;
	}
	
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
	public Key getId() {
		return id;
	}
	public void setId(Key id) {
		this.id = id;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public int getAppl_sub_date() {
		return appl_sub_date;
	}
	public void setAppl_sub_date(int appl_sub_date) {
		this.appl_sub_date = appl_sub_date;
	}
	public int getAppl_upl_date() {
		return appl_upl_date;
	}
	public void setAppl_upl_date(int appl_upl_date) {
		this.appl_upl_date = appl_upl_date;
	}
	public int getConf_date() {
		return conf_date;
	}
	public void setConf_date(int conf_date) {
		this.conf_date = conf_date;
	}
	public int getCr_date() {
		return cr_date;
	}
	public void setCr_date(int cr_date) {
		this.cr_date = cr_date;
	}
	public int getUpd_date() {
		return upd_date;
	}
	public void setUpd_date(int upd_date) {
		this.upd_date = upd_date;
	} 
	
	
}
