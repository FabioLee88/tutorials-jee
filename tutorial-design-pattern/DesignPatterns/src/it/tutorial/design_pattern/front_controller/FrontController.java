package it.tutorial.design_pattern.front_controller;

public class FrontController {

	private Dispatcher dispatcher;
	
	public FrontController() {
		dispatcher = new Dispatcher();
	}
	
	private boolean isAuthenticUser() {
		System.out.println("user is authenticated successfully.");
		return true;
	}
	
	private void trackRequest(String request) {
		System.out.println("page requested: " + request);
	}
	
	public void dispatchRequest(String request) {
		
		trackRequest(request);
		
		if(isAuthenticUser()) {
			dispatcher.dispatch(request);
		}
	}
}
