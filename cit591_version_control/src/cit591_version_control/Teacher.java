package cit591_version_control;
import java.util.*;

public class Teacher {
	String name;
	ArrayList<Course> coursesTaught;
	
	Teacher(String name){
		this.name = name;
		coursesTaught = new ArrayList<Course>();
	}
}
