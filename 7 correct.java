Write a rule to return attribute samAccountName of specific identity from AD application

import org.apache.commons.logging.Log;
	import org.apache.commons.logging.LogFactory;
	import sailpoint.api.SailPointContext;
	import sailpoint.object.Configuration;
	import sailpoint.object.ResourceObject;
	import sailpoint.tools.GeneralException;
	import sailpoint.object.Identity;

import sailpoint.object.Bundle;
 import java.util.HashMap;
	import java.util.ArrayList;
	import sailpoint.object.Application;
import sailpoint.object.Link;
import sailpoint.api.IdentityService;
	
ArrayList list = new ArrayList();
Map results =new HashMap();



Identity identity = context.getObjectByName(Identity.class, "FBJ3");

List linkList = identity.getLinks();

for (Link link: linkList){
	if (link.getApplication().getName().equals("Active Directory")) {
		return link.getAttributes().getString("sAMAccountName");
		
	}
}

