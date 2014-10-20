package test;

import java.util.Formatter;

public class AuxTest {

	public static void main(String[] args) {
		String b="fAlSe";
		 String s1=null,s2=null;
	      s1=new Formatter().format("%b",b).toString();
	      s2=new Formatter().format("%b",(b)).toString();
	      System.out.println(s1+" "+s2);
	}
	
}
