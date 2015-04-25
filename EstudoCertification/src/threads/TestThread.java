package threads;

public class TestThread implements Runnable  {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			
			System.out.println("here");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args)  {
		Thread t = new Thread(new TestThread());
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");
		
	}

}
