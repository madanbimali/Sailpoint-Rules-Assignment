WRITE A RULE TO RETURN ALL THE ROLES AND THEIR CORRESPONDING OWNER.
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
	
	Map map = new HashMap();
 
	List identities = context.getObjects(Identity.class);
	
	for (Identity iden: identities){
	String name = iden.getDisplayName();
	ArrayList list1 = new ArrayList();
	ArrayList list2 = new ArrayList();
      
	if (iden != null){
	List assignedRoles = iden.getAssignedRoles();
	
	for(Bundle bundle: assignedRoles){
		list1.add(  "bundle: " + bundle.getName());
		}
	}if (iden != null){
		
	List detectedRole = iden.getDetectedRoles();
	for(Bundle bundle: detectedRole){
		list2.add( "bundle: " + bundle.getName());
		map.put(name, list1);
		map.put(name, list2);
		}
	}
}
return map;
