package exceptions;

public class TestException {

	
	 public static void main(String args[]){
		 try{
			 System.out.printf("45%2$b%4$+04d",978,654,321,111);
			 System.out.printf("\n %b",978);
			 System.out.println();
			  new TestException().method();
			  
		 }catch(Exception e){
			 System.out.println("Fell down in the catch block");
		 }
	 }
	 
	 public void method() {
		//some stuff here
		 throw new RuntimeException();
	 }
}
