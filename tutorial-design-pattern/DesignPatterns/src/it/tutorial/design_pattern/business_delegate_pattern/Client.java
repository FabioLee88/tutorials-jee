package it.tutorial.design_pattern.business_delegate_pattern;

public class Client {

	BusinessDelegate businessService;
	
	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}
	
	public void doTask() {
		businessService.doTask();
	}
}
