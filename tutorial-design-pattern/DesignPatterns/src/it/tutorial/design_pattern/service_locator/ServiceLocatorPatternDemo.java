package it.tutorial.design_pattern.service_locator;

public class ServiceLocatorPatternDemo {

	public static void main(String[] args) {
		Service service = ServiceLocator.getService("SERVICE1");
		service.execute();
		
		service = ServiceLocator.getService("SERVICE2");
		service.execute();
		
		service = ServiceLocator.getService("SERVICE1");
		service.execute();
		
		service = ServiceLocator.getService("SERVICE2");
		service.execute();
	}
}
