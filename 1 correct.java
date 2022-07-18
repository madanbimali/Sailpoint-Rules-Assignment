WRITE A RULE TO FIND OUT ASSIGNED ROLE AND DETECTED ROLE THE PARTICULAR IDENTITY HAVE.
import org.apache.commons.logging.Log;
	import org.apache.commons.logging.LogFactory;
	import sailpoint.api.SailPointContext;
	import sailpoint.object.Configuration;
	import sailpoint.object.ResourceObject;
	import sailpoint.tools.GeneralException;
	import sailpoint.object.Identity;
	import java.util.List;
	import sailpoint.object.Bundle;
	
	ArrayList list = new ArrayList();
 
		
	Identity identity = context.getObjectByName(Identity.class, "E6XT");
      
	if (identity != null){
	List assignedRoles = identity.getAssignedRoles();
	
	for(Bundle bundle: assignedRoles){
		list.add("bundle: " + bundle.getName());
		
	}
	}if (identity != null){
		
	List detectedRole = identity.getDetectedRoles();
	for(Bundle bundle: detectedRole){
		list.add("bundle: " + bundle.getName());
		
	}
	}

	
	
	
	return list;

