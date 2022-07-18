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
	
	ArrayList results = new ArrayList();
	
 
		
	List identities = context.getObjects(Identity.class);
	for (Identity inde: identities){
	if (identities != null){
	String name = inde.getDisplayName();
	List assignedRoles = inde.getAssignedRoles();
	for(Bundle bundle: assignedRoles){
		results.add(name + " " + bundle.getName());
                results.add("   ");
	}
}
	
	

	if (identities != null) {
	String name = inde.getDisplayName();
		
	List detectedRoles = inde.getDetectedRoles();
	for(Bundle bundle: detectedRoles){
		results.add(name + " " + bundle.getName());
              results.add("  ");
	}
	}
	}
	return results;