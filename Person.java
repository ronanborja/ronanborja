package com.global77;

public class Person {
	private String name;
	private int health = 100;
	
	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + "\nHealth: " + this.health + "\n";
	}
	
	public boolean isAlive() {
		if (this.health <= 0) {
			return false;
		} else {
			return true;
		}
	} 
	
	public boolean heal(int boost) {
		if (!isAlive() || health == 100) {
			return false;
		}else {
			this.health = health + boost;
		}
		return true;
	}
	
	public boolean defends(int damage) {
		if (health - damage < 0) {
			health = 0;
			return !isAlive();
		} else  {
			health = health - damage;
		}
		return isAlive();
	} 
	
	
	
	
	
}
