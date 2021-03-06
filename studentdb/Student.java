
public class Student {
	private String studentNumber;
	private String firstName;
	private char middleInitial;
	private String lastName;
	private String course;
	private int yearLevel;
	
	
	public Student(String studentNumber, String firstName, char middleInitial,
			String lastName, String course, int yearLevel) {
		//super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.course = course;
		this.yearLevel = yearLevel;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public char getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	public String toString(){
		return String.format("Student Number: %s \n"
				+ "Name: %s ,%s %s \n" 
				+ "Program: %s \n"
				+ "Year Level: %s \n"
				,studentNumber, lastName,firstName,middleInitial, course, yearLevel);
	}
}

