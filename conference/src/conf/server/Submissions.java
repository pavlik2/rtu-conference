package conf.server;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;
@PersistenceCapable
public class Submissions {

	public Submissions(int conf_id, String article_name, String annotation,
			String article_pre_rw, String article_post, String abstract_rw,
			int cancelled, String cr_date, int created_by, Date last_update,
			int last_updated_by) {
	//	super();
		this.conf_id = conf_id;
		this.article_name = article_name;
		this.annotation = annotation;
		this.article_pre_rw = article_pre_rw;
		this.article_post = article_post;
		this.abstract_rw = abstract_rw;
		this.cancelled = cancelled;
		this.cr_date = cr_date;
		this.created_by = created_by;
		this.last_update = last_update;
		this.last_updated_by = last_updated_by;
	}
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
	private String article_post;
	@Persistent
	private String abstract_rw;
	@Persistent
	private int cancelled;
	@Persistent
	private String cr_date;
	@Persistent
	private	int created_by;
	@Persistent
	private	Date  last_update; 
	@Persistent
	private	int last_updated_by;
	public Key getId() {
		return id;
	}
	public void setId(Key id) {
		this.id = id;
	}
	public int getConf_id() {
		return conf_id;
	}
	public void setConf_id(int conf_id) {
		this.conf_id = conf_id;
	}
	public String getArticle_name() {
		return article_name;
	}
	public void setArticle_name(String article_name) {
		this.article_name = article_name;
	}
	public String getAnnotation() {
		return annotation;
	}
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	public String getArticle_pre_rw() {
		return article_pre_rw;
	}
	public void setArticle_pre_rw(String article_pre_rw) {
		this.article_pre_rw = article_pre_rw;
	}
	public String getArticle_post() {
		return article_post;
	}
	public void setArticle_post(String article_post) {
		this.article_post = article_post;
	}
	public String getAbstract_rw() {
		return abstract_rw;
	}
	public void setAbstract_rw(String abstract_rw) {
		this.abstract_rw = abstract_rw;
	}
	public int getCancelled() {
		return cancelled;
	}
	public void setCancelled(int cancelled) {
		this.cancelled = cancelled;
	}
	public String getCr_date() {
		return cr_date;
	}
	public void setCr_date(String cr_date) {
		this.cr_date = cr_date;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	public int getLast_updated_by() {
		return last_updated_by;
	}
	public void setLast_updated_by(int last_updated_by) {
		this.last_updated_by = last_updated_by;
	}
	
	
}
