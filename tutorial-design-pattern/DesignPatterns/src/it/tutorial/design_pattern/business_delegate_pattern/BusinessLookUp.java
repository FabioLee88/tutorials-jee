package it.tutorial.design_pattern.business_delegate_pattern;

public class BusinessLookUp {
	
	public BusinessService getBusinessService(String serviceType) {
		if("EJB".equalsIgnoreCase(serviceType)) {
			return new EJBService();
		}else {
			return new JMSService();
		}
	}

}
