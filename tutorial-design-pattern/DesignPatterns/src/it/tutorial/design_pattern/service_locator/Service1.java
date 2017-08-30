package it.tutorial.design_pattern.service_locator;

public class Service1 implements Service {

	@Override
	public String getName() {
		return "Service1";
	}

	@Override
	public void execute() {
		System.out.println("Execute service 1");
	}

}
