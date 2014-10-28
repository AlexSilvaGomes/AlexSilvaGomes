package test;



public abstract strictfp class AuxTest {

	
	public static void main(String[] args) {
		
				A a[] = new B[3];
				
				a[0] = new C();
				a[1] = new B();
				
				Short i = (short) 129;
                Short j = (short)129;
				System.out.println(i==j);				
	}
}


class A{}
class B extends A{}
class C extends B{}