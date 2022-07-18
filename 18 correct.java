Write a rule to return all requestable entitlement in IIQ


  
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

ArrayList list = new ArrayList();
Map map = new HashMap();

List links = context.getObjects(Link.class);
List entls = context.getObjects(ManagedAttribute.class);


for (ManagedAttribute entl: entls){
	String entlments = entl.getValue();
	list.add(entlments);
}
return list;

