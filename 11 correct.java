Write a rule to return  particular identityAttribute(departmentName, email) 
for particular user.
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
	
	
import sailpoint.object.Identity;

import java.util.Map;
import java.util.HashMap;

Map map = new HashMap();
ArrayList list = new ArrayList();

Identity identity = context.getObjectByName(Identity.class, "RBVH");

Object DeptNum = identity.getAttribute("Department Number");
Object email = identity.getAttribute("email");

list.add (DeptNum);
list.add(email);

return list;



