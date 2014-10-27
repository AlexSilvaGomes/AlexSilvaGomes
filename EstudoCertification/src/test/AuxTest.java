package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract strictfp class AuxTest {

	protected abstract void method();

	public <E extends B> E getValue(E e) {
		return e;
	}
	
	static Integer i;
	
	static void boxer(Integer i){
    	System.out.println("after the call!");
    }

	public static void main(String[] a) {		
		
		String[] elements = { "for", "tea", "too" };
		String first = (elements.length > 4)?elements[0] : null;
		
		
		System.out.println(first);
		

	}	
	
}
