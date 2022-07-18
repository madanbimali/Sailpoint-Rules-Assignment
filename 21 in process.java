Write a rule to generate random 15 digit password which contains one upper case, 
one special character,
 one numeric value.
 
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

List list = new ArrayList();

PasswordGenerator pass = new PasswordGenerator(context);
Identity identity = context.getObjectByName(Identity.class, "RBVH");

Application app = context.getObjectByName(Application.class, "Active Directory");


String generatedPass = pass.generatePassword(identity, app);
return(generatedPass);



	
