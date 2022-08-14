package com.global77;
// Roland Nathaniel Borja
public class SimpleAdventure {

	public static void printPerson(Person p) {
		System.out.println("The health of " + p.getName() + " is " + p.getHealth());
		System.out.println(p.getName() + (p.isAlive() ? " is alive." : " has passed on."));
		System.out.println(p);
	}

	public static void printItem(Item item) {
		System.out.println("The item " + item.getName() + " has weight " + item.getWeight());

		if (item instanceof Food) {
			System.out.println("It also heals " + ((Food) item).getHealth());
		}

		if (item instanceof Weapon) {
			System.out.println("It also does " + ((Weapon) item).getDamage() + " damage");
		}

		System.out.println(item);
	}

	public static void main(String[] args) {
		// Create three Persons
		Person frodo = new Person("Frodo Baggins");
		Person sam = new Person("Samwise Gamgee");
		Person gollum = new Person("Smeagol");

		printPerson(frodo);
		printPerson(sam);
		printPerson(gollum);

		// Create some items
		Item sword = new Weapon("Sting", 1.5, 30);
		Item taters = new Food("Taters", 0.3, 45);
		Item book = new Item("There and Back Again", 5.3);

		printItem(sword);
		printItem(taters);
		printItem(book);

		// Set some item data
		taters.setWeight(0.2);
		taters.setName("POTATOES");
		((Food) taters).setHealth(56);

		book.setName("There and Back Again: And What Happened After");
		book.setWeight(15.7);

		sword.setName("Glowing Sting");
		sword.setWeight(1.4);
		((Weapon) sword).setDamage(60);

		printItem(sword);
		printItem(taters);
		printItem(book);

		// Try using some items
		System.out.println("Use book on sword...");
		System.out.println("Can use? " + book.use(sword));
		System.out.println();

		System.out.println("Use book on frodo...");
		System.out.println("Can use? " + book.use(frodo));
		System.out.println();

		System.out.println("Use book on null...");
		System.out.println("Can use? " + book.use(null));
		System.out.println();

		System.out.println("Use sword on gollum...");
		System.out.println("Can use? " + sword.use(gollum));
		System.out.println();

		printPerson(gollum);

		System.out.println("Use sword on book...");
		System.out.println("Can use? " + sword.use(book));
		System.out.println();

		System.out.println("Use sword on null...");
		System.out.println("Can use? " + sword.use(null));
		System.out.println();

		System.out.println("Use taters on null...");
		System.out.println("Can use? " + taters.use(null));
		System.out.println();

		System.out.println("Use taters on book...");
		System.out.println("Can use? " + taters.use(book));
		System.out.println();

		System.out.println("Use taters on gollums...");
		System.out.println("Can use? " + taters.use(gollum));
		System.out.println();

		printPerson(gollum);

		System.out.println("Use sword on gollum...");
		sword.use(gollum);
		printPerson(gollum);
		System.out.println("Use sword on gollum again...");
		sword.use(gollum);
		printPerson(gollum);

		System.out.println("Use taters on gollum...");
		System.out.println("Can use? " + taters.use(gollum));
		System.out.println();
	}
}