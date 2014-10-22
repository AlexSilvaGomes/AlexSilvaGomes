package test;

import java.util.Formatter;

public class AuxTest {

	public static void main(String[] args) {
		 String[] sa[]=new String[2][2];
		    sa[0]=new String[]{"A","B","C","D"};
		    sa[1]=new String[]{"Aa","Bb","CC"};
		    sa[2]= new String[1];
		     for(String[] s:sa){
		       System.out.print(s[1]+", ");
		       System.out.print(s[2]+", ");
		     }
	}
	
}
