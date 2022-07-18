Write a rule to return all the identities that are managers

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
import sailpoint.object.Link;
import sailpoint.api.IdentityService;
	
	
import sailpoint.object.Identity;

ArrayList  list = new ArrayList();
Map results =new HashMap();

List idens = context.getObjects(Identity.class);
for (Identity iden: idens){

String manager = iden.getAttribute("manager");
String name = iden.getDisplayName();

	 
		 
		 list.add(manager);
		 
	 }




return list;