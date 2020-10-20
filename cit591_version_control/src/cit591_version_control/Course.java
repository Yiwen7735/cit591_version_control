package cit591_version_control;

public class Course {
	String name;
	int courseNumber;
	int maxNumStudents;
	
	Course(String name, int courseNumber, int quota){
		this.name = name;
		this.courseNumber = courseNumber;
		this.maxNumStudents = quota;
	}
	
	String getName() {
		return name;
	}
}
