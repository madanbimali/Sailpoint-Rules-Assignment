Write a rule to find list of user who have particular manager, 
and who have AD applications, and email is not null. 
Use QueryOptions and filter

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
import sailpoint.object.QueryOptions;
import sailpoint.object.Filter;

	


Filter myFilter1 = Filter.and(Filter.eq("manager.name", "RBVH"));
Filter myFilter2 = Filter.and(Filter.eq("links.application.name", "Active Directory"));

QueryOptions qo = new QueryOptions();
qo.addFilter(myFilter1);
qo.addFilter(myFilter2);
List list = new ArrayList();

Iterator identities = context.search(Identity.class, qo);

while (identities.hasNext()) {
emp = identities.next();
empID = emp.getDisplayName();
email = emp.getAttribute("email");
if (email != null){
list.add(empID);
}
}
return list;
.