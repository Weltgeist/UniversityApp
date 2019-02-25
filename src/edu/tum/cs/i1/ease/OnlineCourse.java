package edu.tum.cs.i1.ease;

import java.net.MalformedURLException;
import java.net.URL;

public class OnlineCourse extends Course {
	
	public URL url;
	OnlineCourse(String title){
		super(title);
	}
	OnlineCourse(String title,String url){
		super(title);
		try {
			this.url=new URL(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
