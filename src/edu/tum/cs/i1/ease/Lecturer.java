package edu.tum.cs.i1.ease;

import java.util.List;

public class Lecturer extends Person implements CourseList{
	
	public List<Course> courseList;
	public int employeeID;
	
	public Lecturer(String firstName) {
		super(firstName);

	}
	
	public Lecturer(String firstName,String lastName) {
		super(firstName,lastName);

	}

	
	public Lecturer(String name,String lastName,String birthDate) {
		super(name,lastName,birthDate);
	}
	
	@Override
	public void printPersonalInfo() {
		System.out.println("Lecturer: "+name+" "+birthDate+" "+employeeID);
	}
	
	
	public void updateCourseList() {
		
	}
	

}
