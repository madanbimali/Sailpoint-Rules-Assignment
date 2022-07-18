
Write a rule to get the list of user who have Active Directory applications. Use QueryOptions,
 and Filter.Hint Filter.eq(“links.application.name”, “Active Directory”);
 
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

	


Filter myFilter = Filter.and(Filter.eq("links.application.name", "Active Directory"));

QueryOptions qo = new QueryOptions();
qo.addFilter(myFilter);
List list = new ArrayList();

Iterator identities = context.search(Identity.class, qo);

while (identities.hasNext()) {
emp = identities.next();
empID = emp.getDisplayName();
list.add(empID);
}
return list;