package test;
public  strictfp class AuxTest {

	
	public static void main(String[] args) {
		
		System.out.print((int)Character.MIN_VALUE+","+(int)Character.MAX_VALUE);
		boolean b1=false;
	 boolean b2=true;
	 Object ob= (b2=false)?((b1=true)?"A":(b1=false)?"B":9800L):((b1=false)?"C":(b2==false)?"D":new java.util.Date());
	 System.out.print(ob);
	
		System.out.printf("\nCurrent value is %,+-50.1f",-12300.000);
		
	}
	
}
