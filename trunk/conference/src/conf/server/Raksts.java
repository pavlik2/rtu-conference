package conf.server;

import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Text;

/*
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.persistence.Transient;
import javax.persistence.Version;
*/
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//@Entity
@PersistenceCapable
public class Raksts {
	
	
	public Raksts(String nosaukums, String autori, String a_dati,
			String annotacija) {
		//super();
		//this.key = key;
		this.nosaukums = nosaukums;
		this.autori = autori;
		this.a_dati = a_dati;
		this.annotacija = annotacija;
	}

	/*
	@SuppressWarnings("unchecked")
	  public static List<Raksts> findAll() {
	    EntityManager em = entityManager();
	    try {
	      List<Raksts> list = em.createQuery("select o from Raksts o").getResultList();
	      // force to get all the employees
	      list.size();
	      return list;
	    } finally {
	      em.close();
	    }
	  }
	
	public static Raksts findRaksts(Long id) {
	    if (id == null) {
	      return null;
	    }
	    EntityManager em = entityManager();
	    try {
	      Raksts employee = em.find(Raksts.class, id);
	      return employee;
	    } finally {
	      em.close();
	    }
	  }
	
	  public static final EntityManager entityManager() {
		    return EMF.get().createEntityManager();
		  }
	  
	  @Id
	  @Column(name = "id")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)   */
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key id;

//	  @Version
//	  @Column(name = "version")
//	  private Integer version;
	  
    @Persistent
    private String nosaukums;

    @Persistent
    private String autori;

    @Persistent
    private String a_dati;

    @Persistent
    private String annotacija;

	

	public String getNosaukums() {
		return nosaukums;
	}

	public void setNosaukums(String nosaukums) {
		this.nosaukums = nosaukums;
	}

	public String getAutori() {
		return autori;
	}

	public void setAutori(String autori) {
		this.autori = autori;
	}

	public String getA_dati() {
		return a_dati;
	}

	public void setA_dati(String a_dati) {
		this.a_dati = a_dati;
	}

	public String getAnnotacija() {
		return annotacija;
	}

	public void setAnnotacija(String annotacija) {
		this.annotacija = annotacija;
	}


	public Key getId() {
		return this.id;
	}
/*
	 public Integer getVersion() {
		    return this.version;
		  }
	 
	 public void setVersion(Integer version) {
		    this.version = version;
		  }
	*/
	
	public void setId(Key id) {
		this.id = id;
	}
/*   
	public void persist() {
	    EntityManager em = entityManager();
	    try {
	      em.persist(this);
	    } finally {
	      em.close();
	    }
	  }

	  public void remove() {
	    EntityManager em = entityManager();
	    try {
	      Raksts attached = em.find(Raksts.class, this.id);
	      em.remove(attached);
	    } finally {
	      em.close();
	    }
	  } */
    }



