package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name is Kaviya");
	}

	public void studentDept() {
		System.out.println("Student department is EEE");
	}

	public void studentId() {
		System.out.println("Student Id is 10E122");
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.departmentName();
		student.studentName();
		student.studentDept();
		student.studentId();
	}
}
