package conf.client;
import java.util.ArrayList;
import java.util.List;
//import conf.server.Raksts;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import conf.server.Raksts;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	Boolean greetServer(String name,String i1,String i2,String i3) throws IllegalArgumentException;
	ArrayList<String> ret ();
}
