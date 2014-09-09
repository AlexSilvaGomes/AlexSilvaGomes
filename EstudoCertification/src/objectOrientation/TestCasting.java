package objectOrientation;

public class TestCasting {

	Animal a = new Animal();
	Dog d = new Dog();
	Cat c = new Cat();
	Rabbit r = new Rabbit();

	public static void main(String[] args) {
		new TestCasting().method();
	}

	public void method() {

		a = d; // upcasting
		d = (Dog) a; //downcasting possible just because this a(Animal reference has a Dog object)
		
		a = c;
		a = r;
		
		System.out.println("Finish!"+d.toString());
	}

}

class Animal {
	public String toString() {
		return "Animal";
	}
}

class Dog extends Animal {
	public String toString() {
		return "Dog";
	}
}

class Cat extends Animal {
	public String toString() {
		return "Cat";
	}
}

class Rabbit extends Animal {
	public String toString() {
		return "Rabbit";
	}
}
