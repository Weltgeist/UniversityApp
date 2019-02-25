package edu.tum.cs.i1.ease;

import java.util.LinkedList;
import java.util.List;

public class Student extends Person implements CourseList {


		public String majorSubject;
		public String minorSubject;
		public List<Course> courseList;
		public int studentID;
		public String semester;
		
		

		

		public Student(String firstName) {
			super(firstName);

		}
		
		public Student(String firstName,String lastName) {
			super(firstName,lastName);

		}

		
		public Student(String name,String lastName,String birthDate) {
			super(name,lastName,birthDate);
		}
		
		public Student(String name,String lastName,String birthDate,String majorSubject,String minorSubject) {
			super(name,lastName,birthDate);
			this.minorSubject=minorSubject;
			this.majorSubject=majorSubject;
			this.courseList=new LinkedList<Course>();		
		}
		

		@Override
		public void printPersonalInfo() {
			System.out.println("Student: "+name+" "+birthDate+" "+studentID);
		}
		

		public void updateCourseList() {
			
		}
		
		public void joinCourse(Course c) {
			
		}
		
		public void dropCourse(Course c) {
			
		}
		
}
