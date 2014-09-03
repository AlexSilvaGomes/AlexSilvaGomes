package collection_generics;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ALSGomes
 * Simple test abou generics
 */
public class testGenerics {
	
	public static void main(String args[]) {
		
		List<? super Animal> animals = new ArrayList<Animal>();
		animals.add(new Cat());
		animals.add(new Dog());
		animals.add(new Rabbit());
		animals.add(new Animal());		
		
		List<? extends Object> list1 = new ArrayList<String>();
		List<Object> list2 = (List<Object>) list1;		
		list2.add(new Integer(0));

		for (Object animal : animals) {
			System.out.println(animal);
		}
		 
		List<Dog> dogs = new ArrayList<Dog>();		
		
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
