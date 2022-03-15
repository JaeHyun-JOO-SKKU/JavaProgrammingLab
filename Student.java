package task1;

public class Student {
	//set variables
	private String StudentName;
	private int DateofBirth;
	private double Gpa;
	private String Department;
	
	public Student(String studentname,int dateofbirth,double gpa, String department) {
		StudentName = studentname;
		DateofBirth = dateofbirth;
		Gpa = gpa;
		Department = department;
	}
	// arrange to use .get
	public String getStudentName() {
		return StudentName;
	}
	public int getAge() {
		return 2022-DateofBirth;
	}
	public double getGpa() {
		return Gpa;
	}
	public String getDepartment() {
		return Department;
	}
	
	public void setGpa(double gpa) {
		Gpa = gpa;
	}
	public void setDateofBirth(int dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public void setDepartment(String department) {
		Department = department;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
}
