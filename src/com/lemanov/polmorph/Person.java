package com.lemanov.polmorph;

abstract public class Person {
	private String name;
	int INCREASE_CAP = 20;
	
	public Person (String name) {
		this.name = name;
	}
	
	public String getName() {
		return "Person's name is " + name;
	}
	
	public void changeAddress (String address) {
		System.out.println("New address is " + address);
	}
	
	public void promote (int percent) {
		System.out.println("Promoting a worker...");
		giveDayOff();
		
		// calling in abstract method
		increasePay(percent);
	}
	
	public void giveDayOff () {
		System.out.println("Giving a day off to " + name);
	}
	
	public abstract boolean increasePay(int percent);
	
}
