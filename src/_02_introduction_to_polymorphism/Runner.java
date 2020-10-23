package _02_introduction_to_polymorphism;

// Read through the program below including the comments.

class Animal {
	public void speak() {
		System.out.println("I am an animal");
	}
}

class Dog extends Animal {
	public void speak() {
		System.out.println("Woof!");
	}
}

class Bird extends Animal {
	public void speak() {
		System.out.println("Tweet!");
	}
}

class Fish extends Animal {
	public void speak() {
		System.out.println("Gurgle Gurgle Gurgle!");
	}
}

public class Runner {
	public static void main(String[] args) {
		//Polymorphism is when one object has the ability to act like another object.
		System.out.println("POLYMORPHISM");
		
		//animal is an Animal reference pointing to an Animal object 
		Animal animal = new Animal();
		animal.speak(); //prints "I am an animal"
		
		//animal can also point to a Dog object since Dog extends Animal
		animal = new Dog(); 
		animal.speak(); //prints "Woof!"
		
		//animal can also point to a Bird object since Bird extends Animal
		animal = new Bird();
		animal.speak(); //prints "Tweet!"
		
		//animal can also point to a Fish object since Fish extends Animal
		animal = new Fish();
		animal.speak(); //prints "Gurgle Gurgle Gurgle!"
		
		/*CASTING*/
		//casting is when a reference type is temporarily changed into another reference type.
		System.out.println("\nCASTING");
		
		//animal points to a Dog object
		animal = new Dog();
		//Since animal is a reference of Animal, it must be cast to Dog in order to
		//be assigned as a Dog object.
		Dog d = (Dog)animal;
		d.speak(); //prints "Woof!"
		
		animal = new Bird();
		Bird b = (Bird)animal;
		b.speak(); //prints "Tweet!"
		
		animal = new Fish();
		Fish f = (Fish)animal;
		f.speak(); //prints "Gurgle Gurgle Gurgle"
		
	}
}
