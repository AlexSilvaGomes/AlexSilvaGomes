package test;



public abstract strictfp class AuxTest {

	
	public static void main(String[] args) {
		
		A a = new A();
		//X x = (X)a; // compiles
		//a = (A)x; // compiles		
	}
}

interface X{}
final class  A{}
class B{}
class C{}