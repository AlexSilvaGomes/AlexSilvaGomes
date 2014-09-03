package collection_generics;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class KeyPointsNavigableSet {

	public static void main(String args[]) throws Exception{
		 
		NavigableSet nav = new TreeSet<>();
		nav.add("A");
		nav.add("B");
		nav.add("C");
		nav.add("D");
		nav.add("E");	
		
		// Testing flag inclusive and exclusive 
		SortedSet tail = (NavigableSet)nav.tailSet("A");
		NavigableSet head = nav.headSet("E",true );
		NavigableSet sub = nav.subSet("A",false,"E",false);
		
		System.out.print(head.ceiling("B")); 
		System.out.print(head.higher("B"));
		System.out.print(head.floor("B"));
		System.out.println(head.lower("B"));		
		//BCBA
		for (Object object : tail) {
			System.out.print(object);
		}
		System.out.println();
		
		for (Object object : head) {
			System.out.print(object);
		}
		System.out.println();
		
		for (Object object : sub) {
			System.out.print(object);
		}
		
	}
	
}
