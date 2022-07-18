
//Write a rule to return all active directory entitments in IIQ
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
import sailpoint.object.QueryOptions;
import sailpoint.object.Filter;
import sailpoint.object.Identity;
import java.util.Map;
import java.util.HashMap;
import sailpoint.object.EntitlementCollection;
import sailpoint.object.ManagedAttribute;

Filter myFilter = Filter.and(Filter.eq("application.name", "Active Directory"));

QueryOptions qo = new QueryOptions();
qo.addFilter(myFilter);
List list = new ArrayList();


Iterator entls = context.search(ManagedAttribute.class, qo);

while (entls.hasNext()) {
entl = entls.next();
adEntl = entl.getValue();
list.add(adEntl);
}
return list;




