package it.tutorial.design_pattern.data_access_object;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		students.add(new Student("Robert", 0));
		students.add(new Student("Jhon", 1));
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {

		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: roll No " + student.getRollNo() + ", is updated in database");
	}

}
