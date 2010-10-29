package conf.server;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import conf.client.GreetingService;
import conf.shared.FieldVerifier;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import  com.google.appengine.api.datastore.Text;
/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	public Boolean greetServer(String input,String i1,String i2,String i3) throws IllegalArgumentException {
		
		
		 PersistenceManager pm = PMF.get().getPersistenceManager();
		 
Text t = new Text("");
	        Raksts e = new Raksts(input, i1,i2,i3);

	        try {
	            pm.makePersistent(e);
	        } finally {
	            pm.close();
	        }
	        
	        return true;
	/*	// Verify that the input is valid. 
		if (!FieldVerifier.isValidName(input)) {
			// If the input is not valid, throw an IllegalArgumentException back to
			// the client.
			throw new IllegalArgumentException(
					"Name must be at least 4 characters long");
		}

		String serverInfo = getServletContext().getServerInfo();
		String userAgent = getThreadLocalRequest().getHeader("User-Agent");

		// Escape data from the client to avoid cross-site script vulnerabilities.
		input = escapeHtml(input);
		userAgent = escapeHtml(userAgent);

		return "Hello, " + input + "!<br><br>I am running " + serverInfo
				+ ".<br><br>It looks like you are using:<br>" + userAgent;
				*/
	}
	
	public String[] ret () {
		 PersistenceManager pm = PMF.get().getPersistenceManager();
		 Query query = pm.newQuery("select from Raksts");
	//	 query.
		String[] a = new String[4];
		 try {
		        List<Raksts> results = (List<Raksts>) query.execute();
		        if (results.iterator().hasNext()) {
		            for (Raksts e : results) {
		                a[0] = new String(e.getNosaukums());
		                a[1] = new String(e.getAutori());
		                a[2] = new String (e.getA_dati());
		                a[3] = new String (e.getAnnotacija());
		                
		            }
		        } else {
		            // ... no results ...
		        }
		    } finally {
		        query.closeAll();
		    }
		return a;
		    
		
	};
	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 * 
	 * @param html the html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}
}
