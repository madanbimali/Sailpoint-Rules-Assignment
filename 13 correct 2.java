WRITE A RULE TO RETURN ALL THE ROLES AND THEIR CORRESPONDING OWNER.
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

Map roleOwnerMap = new HashMap();
	
	List testList1 = new ArrayList();
	List testList2 = new ArrayList();
	for(Bundle bundle: roleBundleObjects){
		testList1.add(bundle.getName());
		testList2.add(bundle.getOwner().getName());
		roleOwnerMap.put(testList1, testList2);
		
	}
	return roleOwnerMap;
 
	
	
