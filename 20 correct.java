
Write a rule to return of the list of application an identity has
import sailpoint.object.Link;
import sailpoint.object.Identity;
import sailpoint.object.Certification;
import sailpoint.object.EmailOptions;
import sailpoint.object.EmailTemplate;
import sailpoint.object.Configuration;
import sailpoint.api.ObjectUtil;
import java.util.List;
import sailpoint.object.Application;
import sailpoint.object.Application;
import sailpoint.object.Link;
import sailpoint.api.IdentityService;
	

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

ArrayList list = new ArrayList();

Identity  identity = context.getObjectByName(Identity.class, "E6XT");

List links = identity.getLinks();
 
 for(Link link: links){
	 
	String name = link.getApplicationName();
	list.add(name);
		 
	 }


return list;