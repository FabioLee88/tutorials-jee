package it.tutorial.design_pattern.visitor_pattern;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Display Computer.");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Display Mouse.");

	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Display Keyboard.");

	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Display Monitor.");

	}

}
