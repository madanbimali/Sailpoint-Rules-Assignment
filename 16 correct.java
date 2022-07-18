Write a rule to find out the assigned Role and the detected Role the
 particular Identity have.

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
 
		
	Identity identity = context.getObjectByName(Identity.class, "RBVH");
      
	if (identity != null){
	List assignedRoles = identity.getAssignedRoles();
	
	for(Bundle bundle: assignedRoles){
		list.add("assignedRoles: " + bundle.getName());
		
	}
	}if (identity != null){
		
	List detectedRole = identity.getDetectedRoles();
	for(Bundle bundle: detectedRole){
		list.add("detectedRoles: " + bundle.getName());
		
	}
	}

	
	
	
	return list;

