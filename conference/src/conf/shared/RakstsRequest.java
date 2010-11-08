package conf.shared;

import java.util.List;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.Service;

import conf.server.Raksts;


  
@Service(Raksts.class)
	public interface RakstsRequest extends RequestContext {
	 Request<Proxy2> findRaksts(Long id);
	 
		Request<List<Proxy2>> findAll();
		/**
		   * @return a request object
		   */
		  InstanceRequest<Proxy2, Void> persist();

		 /**
		  * @return a request object
		  */
		  InstanceRequest<Proxy2, Void> remove();
		}

