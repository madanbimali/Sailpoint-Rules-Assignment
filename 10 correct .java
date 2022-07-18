
new Write a rule to return entitlements from particular  Applications.

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
import sailpoint.object.Attributes;
import sailpoint.object.Identity;
import java.util.ArrayList;
import java.util.HashMap;
import sailpoint.object.Link;
import sailpoint.object.EntitlementCollection;
import sailpoint.object.ManagedAttribute;
import sailpoint.object.Filter;
import sailpoint.object.QueryOptions;


Filter myFilter = Filter.and(Filter.eq("application.name", "Door management System"));

QueryOptions qo = new QueryOptions();
qo.addFilter(myFilter);
List list = new ArrayList();

Iterator entls = context.search(ManagedAttribute.class, qo);

while (entls.hasNext()) {
manaAttr = entls.next();
entitlements = manaAttr.getValue();
list.add(entitlements);
}
return list;


