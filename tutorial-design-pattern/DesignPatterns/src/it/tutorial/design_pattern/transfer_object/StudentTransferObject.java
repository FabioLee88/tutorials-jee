package it.tutorial.design_pattern.transfer_object;

public class StudentTransferObject {

	private String name;
	private int rollNo;

	public StudentTransferObject(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}
