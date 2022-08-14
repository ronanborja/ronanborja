package com.global77;

public class Food extends Item{
	private int health;
	public Food(String name, double weight, int health) {
		super(name, weight);
		this.health = health;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + "\nWeight: " + this.getWeight() + "\nHealth: " + this.health + "\n";
	}
	
	public boolean use(Object target) {
		if (target instanceof Person) {
			Person p = (Person) target;
			if (p.heal(health)) {
				System.out.println(p.getName() + " ate " + this.getName() + " for " + this.getHealth() + " health!");
				return true;
			} else {
				System.out.println(p.getName() + " cannot be healed!");
				return false;
			} 
		} else {
			return false;
		}
	}
	

}
