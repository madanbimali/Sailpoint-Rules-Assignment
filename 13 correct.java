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
        Map role = new HashMap();
	
 
		
	List identities = context.getObjects(Identity.class);
	for (Identity inde: identities){
		log.error(inde.getName());
	if (identities != null){
	String name = inde.getDisplayName();
	List assignedRoles = inde.getAssignedRoles();
	for(Bundle bundle: assignedRoles){
		role.put(name, bundle.getName());
                 results.add(role);
                results.add("   ");
	}
}
	
	

	if (identities != null) {
	String name = inde.getDisplayName();
		
	List detectedRoles = inde.getDetectedRoles();
	for(Bundle bundle: detectedRoles){
            role.put(name, bundle.getName());
                 results.add(role);
                results.add("   ");
		
	}
	}
	}
	return results;