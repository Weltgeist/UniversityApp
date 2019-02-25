package edu.tum.cs.i1.ease;

import java.awt.Point;
import java.util.Date;
import java.util.List;

public class LectureCourse extends Course {
	
	public Point location;

	/**
	 * @param title
	 * @param date
	 */
	public LectureCourse(String title, Date date, Point location) {
		super(title, date);
		// TODO Auto-generated constructor stub
		this.location=location;
	}

	/**
	 * @param title
	 * @param date
	 */
	public LectureCourse(String title, List<Date> date, Point location) {
		super(title, date);
		// TODO Auto-generated constructor stub
		this.location=location;
	}

	/**
	 * @param title
	 */
	public LectureCourse(String title, Point location) {
		super(title);
		// TODO Auto-generated constructor stub
		this.location=location;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
	}

}
