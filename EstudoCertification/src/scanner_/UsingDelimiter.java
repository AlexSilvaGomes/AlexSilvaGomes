package scanner_;

import java.util.Scanner;

public class UsingDelimiter {
	public static void main(String args[]){
		System.out.println("Tap something");
		Scanner s = new Scanner(System.in);
		s.useDelimiter("\\d");
		while(s.hasNext()){
			System.out.println(s.next() +"-");
		}
		
		
		
	}

}
