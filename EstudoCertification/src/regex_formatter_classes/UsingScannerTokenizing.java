package regex_formatter_classes;

import java.util.Scanner;

public class UsingScannerTokenizing {
	
	public static void main (String args[]){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter with a value!");
	    
		while(s.hasNext()){
			if(s.hasNextInt()){
				System.out.println("Int.:"+s.nextInt());
			}else 
			{
				System.out.println("String.:"+s.next());
			}
			
			
		}
		System.out.println("End");
	}

}
