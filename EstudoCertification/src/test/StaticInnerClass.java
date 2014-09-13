package test;



/**
 * @author Alex
 * Showing the correct instanciating of a static inner class
 */
public class StaticInnerClass{
	
	public static void main(String[] args) {
		Bar bar = new Bar();
		
		new StaticInnerClass().method();
		System.out.println("working");
	}
	
	public void method(){
		Bar bar = new Bar();
	}
	
	public static class Bar{
		
	}

}
 

class outer{
	public void method(){
		StaticInnerClass.Bar b = new StaticInnerClass.Bar();
	}
}


