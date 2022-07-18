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
import sailpoint.object.ResourceObject; 
import sailpoint.object.AccountGroup; 
import sailpoint.object.Identity; 
import sailpoint.tools.ldap.ObjectClass;
import sailpoint.object.SailPointObject;

ArrayList list = new ArrayList();

List entls = context.getObjects(ManagedAttribute.class);

for (ManagedAttribute entl: entls){

String manAttr = entl.getValue();

String des = entl.getDescription("en_US");

Identity owner = entl.getOwner();
if (owner!= null){
String ownerName = owner.getName();
}


list.add(manAttr);
list.add(des);
list.add(owner);
list.add("------------------------------------");
	
}
return list;



