package conf.shared;
import com.google.gwt.requestfactory.shared.EntityProxy;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.ProxyFor;

import conf.server.Raksts;

 
@ProxyFor(Raksts.class)
	public interface Proxy2 extends EntityProxy {
		String getNosaukums();
		void setNosaukums(String nosaukums);
		String getAutori();
		void setAutori(String autori);
		String getA_dati();
		void setA_dati(String a_dati);
		String getAnnotacija();
		void setAnnotacija(String annotacija);
		
		
		Long getid();
		EntityProxyId<Proxy2> stableId();
	}


