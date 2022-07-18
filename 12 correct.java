WRITE A RULE TO RETURN ALL THE CERTIFICATION IN YOUR SYSTEM AND ITS CERTIFIERS.

import org.apache.commons.logging.Log;
	import org.apache.commons.logging.LogFactory;
	import sailpoint.api.SailPointContext;
	import sailpoint.object.Configuration;
	import sailpoint.object.ResourceObject;
	import sailpoint.tools.GeneralException;
	import sailpoint.object.Identity;
	import java.util.List;
	import sailpoint.object.Bundle;
	import sailpoint.object.Certification;
	
	
	ArrayList list = new ArrayList();
 
   List identities = context.getObjects(Identity.class);
   List certs = context.getObjects(Certification.class);
  
  

	 for(Certification cert: certs){
		 String certname = cert.getCertificationName();
         List certifiers = cert.getCertifiers();
  
 
      list.add("certification name:  " + certname);
	  list.add("Certifier:  " + certifiers);
	  
    
    }
  return list;
