 Write a rule to get all the User Rights(capability) of  all users. Return in map 
 format with key as user and value as list of user rights.
 
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
import sailpoint.object.Capability;

	

Map map = new HashMap();
ArrayList list = new ArrayList();

List identities = context.getObjects(Identity.class);
for (Identity iden: identities){
	List capabilities = iden.getCapabilities();
	String name = iden.getDisplayName();
	
	list.add(name +"  "+ capabilities);
	return list;
}
	
	
