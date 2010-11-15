package conf.server;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;
@PersistenceCapable
public class Reviews {

	public Reviews(int reviewer_id, int submission_id, int total_summary,
			int reccomendations, String comments_for_a, String absr_comm,
			Boolean submitted, Boolean approved, int cr_date, int cr_by,
			int last_update_date, int last_updated_by) {
	//	super();
		this.reviewer_id = reviewer_id;
		this.submission_id = submission_id;
		this.total_summary = total_summary;
		this.reccomendations = reccomendations;
		this.comments_for_a = comments_for_a;
		this.absr_comm = absr_comm;
		this.submitted = submitted;
		this.approved = approved;
		this.cr_date = cr_date;
		this.cr_by = cr_by;
		this.last_update_date = last_update_date;
		this.last_updated_by = last_updated_by;
	}
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
	public int getReviewer_id() {
		return reviewer_id;
	}
	public void setReviewer_id(int reviewer_id) {
		this.reviewer_id = reviewer_id;
	}
	public int getSubmission_id() {
		return submission_id;
	}
	public void setSubmission_id(int submission_id) {
		this.submission_id = submission_id;
	}
	public int getTotal_summary() {
		return total_summary;
	}
	public void setTotal_summary(int total_summary) {
		this.total_summary = total_summary;
	}
	public int getReccomendations() {
		return reccomendations;
	}
	public void setReccomendations(int reccomendations) {
		this.reccomendations = reccomendations;
	}
	public String getComments_for_a() {
		return comments_for_a;
	}
	public void setComments_for_a(String comments_for_a) {
		this.comments_for_a = comments_for_a;
	}
	public String getAbsr_comm() {
		return absr_comm;
	}
	public void setAbsr_comm(String absr_comm) {
		this.absr_comm = absr_comm;
	}
	public Boolean getSubmitted() {
		return submitted;
	}
	public void setSubmitted(Boolean submitted) {
		this.submitted = submitted;
	}
	public Boolean getApproved() {
		return approved;
	}
	public void setApproved(Boolean approved) {
		this.approved = approved;
	}
	public int getCr_date() {
		return cr_date;
	}
	public void setCr_date(int cr_date) {
		this.cr_date = cr_date;
	}
	public int getCr_by() {
		return cr_by;
	}
	public void setCr_by(int cr_by) {
		this.cr_by = cr_by;
	}
	public int getLast_update_date() {
		return last_update_date;
	}
	public void setLast_update_date(int last_update_date) {
		this.last_update_date = last_update_date;
	}
	public int getLast_updated_by() {
		return last_updated_by;
	}
	public void setLast_updated_by(int last_updated_by) {
		this.last_updated_by = last_updated_by;
	} 
	
	
	

}
