package edu.tum.cs.i1.ease;

public abstract class Person {
	protected String name;
	protected String firstName;
	protected String lastName;
	protected  String birthDate;
	
	Person(String firstName){
		this.firstName=firstName;
		this.name=firstName;
	}
	Person(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		this.name=firstName+" "+lastName;
	}
	Person(String firstName,String lastName, String birthDate){
		this.firstName=firstName;
		this.lastName=lastName;
		this.name=firstName+""+lastName;
		this.birthDate=birthDate;
	}
	
//	public void printPersonalInfo() {
//		System.out.println("Person: "+name+""+birthDate);
//	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public abstract void printPersonalInfo();


}
