package conf.server;

import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import  com.google.appengine.api.datastore.Text;
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

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private String nosaukums;

    @Persistent
    private String autori;

    @Persistent
    private String a_dati;

    @Persistent
    private String annotacija;

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

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
   
        
    }



