.Write a rule to get all the list of  active users in sailpoint .


import org.apache.commons.logging.Log;
	import org.apache.commons.logging.LogFactory;
	import sailpoint.api.SailPointContext;
	import sailpoint.object.Configuration;
	import sailpoint.object.ResourceObject;
	import sailpoint.tools.GeneralException;
	import sailpoint.object.Identity;
	import java.util.List;
import sailpoint.object.Bundle;
 import java.util.HashMap;
	import java.util.ArrayList;
	import sailpoint.object.Application;
import sailpoint.object.Link;
import sailpoint.api.IdentityService;
	

Map map = new HashMap();
ArrayList list = new ArrayList();

List identities = context.getObjects(Identity.class);
for (Identity iden: identities){
	
	String name =iden.getDisplayName();

Application app = context.getObjectByName(Application.class, "HR Feed");

IdentityService is = new IdentityService(context);
 List links = is.getLinks(iden, app);
 
 for(Link link: links){
	 
	 String status = link.getAttribute("status");
	 if (status.equals("Active")){
		 
		list.add (status +" " + name);
		
	
		
		 
	 }
 }
}
 return list;
