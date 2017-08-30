package it.tutorial.design_pattern.transfer_object;

public class TransferObjectPatternDemo {

	public static void main(String[] args) {
		StudentBusinessObject studentBusinessObject = new StudentBusinessObject();

		for (StudentTransferObject student : studentBusinessObject.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}

		StudentTransferObject student = studentBusinessObject.getAllStudents().get(0);
		student.setName("Michael");
		studentBusinessObject.updateStudent(student);
		
		student = studentBusinessObject.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");

	}
}
