package edu.tum.cs.i1.ease;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Course EIST=new Course("EIST");
		Date   date= new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = formatter.parse("2017-05-30");
			List<Date> dateListSEECx=new ArrayList<>(1);
			dateListSEECx.add(date);
			Course SEECx=new Course("SEECx", date);
			SEECx.printCourseTitle();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		
		//Date EASEDate=new Date(2017,05,30);
		Course EASE=new Course("EASE");
		Student student=new Student("Bob");
		student.printPersonalInfo();
		Student dave=new Student("Bob","Reneaud","17-09-1901","Computer Science","Commerce");
		dave.courseList.add(EASE);
		dave.courseList.add(EIST);
		
		//static
		//Person is a abstract type, hence here it<s beig called via pointers.
		Person s=new Student("Bob", "Davis","12/20/1990","Computer Science","Mechanical Engineering");
		Person l=new Lecturer("John","Lewis","1/23/1960");
		
		s.printPersonalInfo();
		l.printPersonalInfo();
		
		
		
		 System.exit(0);

	}

}
