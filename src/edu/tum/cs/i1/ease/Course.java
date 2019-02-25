package edu.tum.cs.i1.ease;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course implements Printable {
	
	public String title;
	public List<Date> dates;
	public Lecturer lecturer;
	public List<Student> attendees;
	
	Course(String title){
		this.title=title;
	}
	
	Course(String title,Date date){
		this.title=title;
		this.dates = new ArrayList<Date>();
		this.dates.add(date);
	}
	
	Course(String title,List<Date> date){
		this.title=title;
		this.dates.addAll(date);
	}
	
	
	
//	Course(String title,String dateInString){
//
//		this.dates.add(Date.);
//
//		this.title=title;
//
//	}
	
	public void printCourseTitle() {
		System.out.println(title);
	}

	public void printInfo() {
		printCourseTitle();
	}
	
}
