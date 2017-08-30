package it.tutorial.design_pattern.transfer_object;

import java.util.ArrayList;
import java.util.List;

public class StudentBusinessObject {

	private List<StudentTransferObject> students;

	public StudentBusinessObject() {
		students = new ArrayList<StudentTransferObject>();
		StudentTransferObject student1 = new StudentTransferObject("Robert", 0);
		StudentTransferObject student2 = new StudentTransferObject("Jhon", 1);

		students.add(student1);
		students.add(student2);
	}

	public void deleteStudent(StudentTransferObject student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");

	}

	public List<StudentTransferObject> getAllStudents() {
		return students;
	}

	public StudentTransferObject getStudent(int rollNo) {
		return students.get(rollNo);
	}

	public void updateStudent(StudentTransferObject student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}
}
