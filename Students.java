package week3.day1.assignments;

// Overloading getStudentInfo method

public class Students {

	public void getStudentInfo() {
		System.out.println("Printing Student Information");
	}

	public void getStudentInfo(int id) {
		System.out.println("Student id is: " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is: " + id);
		System.out.println("Student name is: " + name);
	}

	public void getStudentInfo(String email, long phoneNo) {
		System.out.println("Student email is: " + email);
		System.out.println("Student phonenumber is: " + phoneNo);
	}

	public static void main(String[] args) {
		Students students = new Students();
		students.getStudentInfo();
		students.getStudentInfo(1001);
		students.getStudentInfo(1001, "kaviya");
		students.getStudentInfo("kaviya@domain.com", 9940567321L);
	}

}
