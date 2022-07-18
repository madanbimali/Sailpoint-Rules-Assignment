//Write a rule to return all the Distinguished Name of Identities from Ad application.
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
	
ArrayList list = new ArrayList();
Map map = new HashMap();

List identities = context.getObjects(Identity.class);

Application app = context.getObjectByName(Application.class, "Active directory");

for (Identity iden: identities){
IdentityService is = new IdentityService(context);
 List links = is.getLinks(iden, app);
 for(Link link: links){
	 
	 String disname = link.getAttribute("distinguishedName");
	 string name = link.getDisplayName();
	
		map.put(name, "distinguishedname:  " + disname);
		list.add(map);
		


	

 }
}
return list;


