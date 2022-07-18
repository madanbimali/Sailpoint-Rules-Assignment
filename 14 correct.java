//Write a rule to return one business role and its IT roles.

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
	
Map map = new HashMap();
ArrayList list = new ArrayList();
ArrayList list1 = new ArrayList();
ArrayList list2 = new ArrayList();
Identity iden = context.getObjectByName(Identity.class, "E6XT");

List assignedRoles = iden.getAssignedRoles();
List detectedRoles = iden.getDetectedRoles();

for(Bundle bundle: assignedRoles){
	list1.add("BusinessRoles:  " + bundle.getName());
}
for(Bundle bundle: detectedRoles){
	list2.add("DetectedRoles:  " + bundle.getName());
		
		list.add(list1);
		list.add(list2);
return list;		
}

