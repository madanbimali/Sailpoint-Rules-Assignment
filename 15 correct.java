Write a rule to return all the workflows which has type "LCMProvisioning".
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
import sailpoint.object.Workflow;
import sailpoint.object.Workflow;

ArrayList list = new ArrayList();

List workflows = context.getObjects(Workflow.class);

for (Workflow workflow: workflows){
	String lcms = workflow.getType();
	if(lcms.equals("LCMProvisioning")){
	
    
		list.add(lcms);
}
}
	

return list;


