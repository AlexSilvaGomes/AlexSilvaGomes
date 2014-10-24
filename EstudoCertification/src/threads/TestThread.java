package threads;

public class TestThread implements Runnable  {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			Thread.yield();
			System.out.println("here");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args)  {
		Thread t = new Thread(new TestThread());
		t.start();
		
	}

}
