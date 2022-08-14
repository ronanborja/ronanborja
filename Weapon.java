package com.global77;

public class Weapon extends Item {

	private int damage;

	public Weapon(String name, double weight, int damage) {
		super(name, weight);
		this.damage = damage;
	}

	public int getDamage() {
		return this.damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + "\nWeight: " + this.getWeight() + "\nDamage: " + this.getDamage() + "\n";
	}

	public boolean use(Object target) {
		if (target instanceof Person) {
			Person p = (Person) target;
			System.out.println("Attack " + p.getName() + " with " + this.getName() + " for " + this.getDamage() + " damage!");
			if (p.defends(damage)) {
				System.out.println(p.getName() + " is dead!");
				return true;
			} else {
				System.out.println(p.getName() + " lives!");
				return false;
			}
		} else {

			return false;
		}
	}

}
