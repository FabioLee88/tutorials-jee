package it.tutorial.design_pattern.front_controller;

public class Dispatcher {

	private StudentView studentView;
	private HomeView homeView;
	
	public Dispatcher() {
		studentView = new StudentView();
		homeView = new HomeView();
	}
	
	public void dispatch(String request) {
		if("STUDENT".equalsIgnoreCase(request)) {
			studentView.show();
		}else {
			homeView.show();
		}
	}
	
}
