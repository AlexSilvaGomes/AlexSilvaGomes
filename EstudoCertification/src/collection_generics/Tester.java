package collection_generics;

import java.util.ArrayList;

import java.util.List;

interface Chewable {
}

class Meat implements Chewable {
}

public class Tester {

	public static List<? extends Chewable> printSize(
			List<? extends Chewable> list) { // Line 10

		System.out.println(list.size());

		return list;

	}

	public static void main(String[] args) {

		List<? extends Chewable> list1 = new ArrayList<Meat>(); // Line 16

		List<Chewable> list2 = new ArrayList<Chewable>(); // Line 17

		List<Meat> list3 = new ArrayList<Meat>(); // Line 18

		list1 = printSize(list1); // Line 20

		//list2 =printSize(list2); // commented because there is a mistake  Line 21

		//list3 = printSize(list3); //commented because there is a mistake Line 22

	}

}