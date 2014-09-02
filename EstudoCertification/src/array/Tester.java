package array;

public class Tester {

	static void test(int[] a) {

		int[] b = new int[2];

		a = b;

		System.out.print(b.length);

		System.out.print(a.length);

	}

	static void test(Animal animal) {

		//Animal a = animal;
		animal = null;
		
		//System.out.println(animal.tipo);
		

	}

	public static void main(String[] args) {

		int[] a = new int[5];
		Animal animal = new Animal();
		animal.tipo = "G";

		test(a);
		System.out.println(a.length);

		test(animal);
		System.out.println(animal.tipo);

	}

}

class Animal {
	String tipo= "";
}