package it.tutorial.design_pattern.composite_entity_pattern;

public class CompositEntityPatternDemo {

	public static void main(String[] args) {
		Client client = new Client();
		client.setData("Test", "Data");
		client.printData();
		client.setData("Second Test", "Data1");
		client.printData();
	}
}
