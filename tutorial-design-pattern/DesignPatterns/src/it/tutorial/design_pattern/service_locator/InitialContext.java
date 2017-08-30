package it.tutorial.design_pattern.service_locator;

public class InitialContext {

	public Object lookup(String jndiname) {
		if ("SERVICE1".equalsIgnoreCase(jndiname)) {
			System.out.println("Looking up and creating a new Service1 object");
			return new Service1();
		} else if ("SERVICE2".equalsIgnoreCase(jndiname)) {
			System.out.println("Looking up and creating a new Service2 object");
			return new Service2();
		}
		return null;
	}
}
