import java.io.Serializable;

public class Course implements Serializable{
	String courseCode;
	String courseDescription;

	public Course(String courseCode, String courseDescription) {
		this.courseCode = courseCode;
		this.courseDescription = courseDescription;

	}
	public void setCourseCode(String courseCode){
		this.courseCode = courseCode;
	}
	public String getCourseCode(){
		return courseCode;
	}
	public void setCourseDescription(String courseDescription){
		this.courseDescription = courseDescription;
	}
	public String getCourseDescription(){
		return courseDescription;
	}


	@Override
	public String toString(){
		return "Course Code:  "  + courseCode + "\nCourse Description: " + courseDescription; 
	}
}
