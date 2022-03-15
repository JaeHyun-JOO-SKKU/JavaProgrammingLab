package task1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//get name from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		//get birth year from user
		String studentname = sc.nextLine();
		System.out.print("Enter your date of birth: ");
		//get GPA from user
		int dateofbirth = sc.nextInt();
		System.out.print("Enter your cumulative GPA: ");
		//get department from user
		double Gpa = sc.nextDouble();
		System.out.print("Enter your department: \n" );
		// used blank scanner to prevent missing line
		sc.nextLine();
		String department = sc.nextLine();
		
		//get from Student.java and show output
		Student studentObject = new Student(studentname, dateofbirth, Gpa, department);
		System.out.println("==========================");
	    System.out.println("Student name: " + studentObject.getStudentName());
	    System.out.println("Student's age: " + studentObject.getAge());
	    System.out.println("Student's CGPA: " + studentObject.getGpa());
	    System.out.println("Student's department: " + studentObject.getDepartment());
	}
}