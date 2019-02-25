package edu.tum.cs.i1.seecx;

import edu.tum.cs.i1.ease.*;

public abstract class Interaction {
	public Person initiator;

	public Interaction(Person initiator) {
		this.initiator = initiator;
	}
	
	
	public Person getInitiator() {
		return initiator;
	}


	public void setInitiator(Person initiator) {
		this.initiator = initiator;
	}


	public abstract void printInteraction();
	
	

	
}
