package com.global77;

public class Item {
	private String iname;
	private double weight;
	public Item(String name, double weight) {
		this.iname = name;
		this.weight = weight;
	}
	
	// getters
	public String getName() {
		return this.iname;
	}
	public double getWeight() {
		return this.weight;
	}
	
	//setters
	public void setName(String name) {
		this.iname = name;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//toString
	@Override
	public String toString() {
		return "Name: " + this.iname + "\nWeight: " + this.weight + "\n";
	}
	
	public boolean use(Object target) {
		System.out.println("Not usable");
		return false;
	}
	

}
