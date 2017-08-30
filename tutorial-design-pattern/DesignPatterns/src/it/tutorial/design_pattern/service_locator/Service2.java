package it.tutorial.design_pattern.service_locator;

public class Service2 implements Service {

	@Override
	public String getName() {
		return "Service2";
	}

	@Override
	public void execute() {
		System.out.println("Execute service 2");
	}

}
