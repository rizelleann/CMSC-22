
import java.io.Serializable;

public class Student implements Serializable{
	private String studentNumber;
	private String firstName;
	private char middleInitial;
	private String lastName;
	private String course;
	private int yearLevel;
	private String crushName;
	private Course faveSubject;
	
	
	public Student(String studentNumber, String firstName, char middleInitial,
			String lastName, String course, int yearLevel, String crushName, Course faveSubject) {
		//super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.course = course;
		this.yearLevel = yearLevel;
		this.crushName = crushName;
		this.faveSubject = faveSubject;
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
	public Course getFaveSubject() {
		return faveSubject;
	}
	public void setFaveSubject(Course faveSubject) {
		this.faveSubject = faveSubject;
	}
	public String crushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}



        @Override
	public String toString(){
		return String.format("Student Number: %s \n"
				+ "Name: %s ,%s %s \n" 
				+ "Program: %s \n"
				+ "Year Level: %s \n" 
				+ "Crush Name: %s \n"
				+ "Favorite Subject: "
				,studentNumber, lastName,firstName,middleInitial, course, yearLevel, crushName, faveSubject);
	}
}

