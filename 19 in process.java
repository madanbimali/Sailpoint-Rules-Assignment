. Write a rule to return the description and owner of entitments in IIQ

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
import sailpoint.object.Entitlement;
import sailpoint.object.ManagedAttribute;

	
	

ArrayList list = new ArrayList();

List entls = context.getObjects(ManagedAttribute.class);

for (ManagedAttribute entl: entls){

String des = entl.getDescription();
String member = entl.getMemberAttribute();


	list.add(des);
	
}

return list;



//for (Identity iden: identities){
	//List entl = iden.getEntitlementAttributeNames();
	for(Application appl: apps){
		List entle = appl.getEntitlementAttributeNames();

list.add(entl);
list.add(description);
list.add(entle);
}
return list;	
