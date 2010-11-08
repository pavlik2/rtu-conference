package conf.client;
import java.util.ArrayList;
import java.util.List;

import conf.server.Raksts;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */

public interface GreetingServiceAsync {
	void greetServer(String input,String i1,String i2,String i3, AsyncCallback<Boolean> callback)
			throws IllegalArgumentException;
	
	void ret(AsyncCallback<ArrayList<String>> callback);
}
