package cit591_version_control;

public class Course {
	String name;
	int courseNumber;
	int maxEnrollment;
	
	Course(String name, int courseNumber, int quota){
		this.name = name;
		this.courseNumber = courseNumber;
		this.maxEnrollment = quota;
	}
	
	String getName() {
		return name;
	}
}
