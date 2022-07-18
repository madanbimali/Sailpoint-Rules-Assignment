Write a rule to create new custom object and populate the custom object with 
key as user and value as email

import sailpoint.api.PasswordGenerator;
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
import sailpoint.object.Custom;
import sailpoint.object.Scope;

HashMap sailpointMap = new HashMap();


Custom sailpoint = context.getObjectByName(Custom.class, "sailpoint");
// if scope "All" doesn't exist yet, create it
if (sailpoint == null) {
  sailpoint = new Custom();
 context.saveObject(sailpoint);
 
 List idens = context.getObjects(Identity.class);
for(Identity iden: idens){
	String email = iden.getEmail();
	String user = iden.getDisplayName();
if (email != null && email.lenghth()>0){
sailpoint.put(user, email);
context.commitTransaction();
}
}
}
return sailpoint;