Write a rule to return a map of users and role. Return map should have key as user, 
and value  as list of assigned roles.


import org.apache.commons.logging.Log;
	import org.apache.commons.logging.LogFactory;
	import sailpoint.api.SailPointContext;
	import sailpoint.object.Configuration;
	import sailpoint.object.ResourceObject;
	import sailpoint.tools.GeneralException;
	import sailpoint.object.Identity;
	import java.util.List;
	import sailpoint.object.Bundle;
	import java.util.ArrayList;

 ArrayList list = new ArrayList();
 
		
	List identities = context.getObjects(Identity.class);
	for (Identity iden: identities){
   
	if (iden != null){
	List assignedRoles = iden.getAssignedRoles();
	String name = iden.getDisplayName();
	for(Bundle bundle: assignedRoles){
		if(assignedRoles != null){
	   
		list.add(name + " " + bundle.getName());
	
	}
	}
	}
	}
	return list;