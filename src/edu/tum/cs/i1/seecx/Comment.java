package edu.tum.cs.i1.seecx;

import edu.tum.cs.i1.ease.Person;

public class Comment extends Interaction implements Likeable {
	
	public String text;
	


	public Comment(Person initiator, String text) {
		super(initiator);
		this.text = text;
	}
	
	



	public String getText() {
		return text;
	}





	public void setText(String text) {
		this.text = text;
	}





	@Override
	public void printInteraction() {
		System.out.println("Firstname: "+initiator.getFirstName());
		System.out.println("Says: "+text);
	};
	
	
	public void like() {
		System.out.println("Liked by: "+initiator.getFirstName());
		
	}
	

}
