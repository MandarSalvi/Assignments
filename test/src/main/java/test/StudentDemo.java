package test;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setStudDetails(1, "Mandar", 95, 90, 85);
		
		student.calculateTotal();
		
		student.displayStudentDetails();

	}

}
