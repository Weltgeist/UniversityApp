package edu.tum.cs.i1.seecx;

import edu.tum.cs.i1.ease.Person;

public class Like extends Interaction {
	

	public Like(Person initiator) {
		super(initiator);
		// TODO Auto-generated constructor stub
	};
	
	@Override
	public void printInteraction() {
		System.out.println("Liked by: "+initiator.getFirstName());
	}



}
