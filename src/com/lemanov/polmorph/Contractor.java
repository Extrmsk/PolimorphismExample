package com.lemanov.polmorph;

public class Contractor extends Person implements Payable {

	public Contractor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean increasePay(int percent) {
		if (percent < Payable.INCREACE_CAP) {
			System.out.println("Increasing hourly rate by " + percent + "% " + getName());
			return true;
		} else {
			System.out.println("Can't increase hourly rate by more than " + Payable.INCREACE_CAP + "% for " + getName());
			return false;
		}
	}

}
