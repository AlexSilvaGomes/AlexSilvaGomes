package Assignments;

public class TestGarbageCollector {
	
	
	public static void main(String args[]){
		
		TestGarbageCollector t = new TestGarbageCollector();
		System.out.println((Runtime.getRuntime().freeMemory()/1024)/1024+"MB");
		System.out.println((Runtime.getRuntime().totalMemory()/1024)/1024+"MB");
		t.createObj();	
		System.out.println("Finish");
	}
	
	public void finalize(){
		System.out.println("Cleaning object!");		
	}
	
	public void createObj(){
		
		for(int i=0; i<1100000;i++){
			TestGarbageCollector t = new TestGarbageCollector();				
		}
		System.out.println(Runtime.getRuntime().freeMemory()/1024+"MB");
	}
	
	

}
