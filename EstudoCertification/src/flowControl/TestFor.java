package flowControl;

public class TestFor {

	final int test = method();

	public TestFor() {
		System.out.println("Running constructor");
	}

	public static void main(String args[]) {

		for (;;) {
			break;
		}
		System.out.println("Value:" + new TestFor().test);
	}

	public int method() {
		System.out.println("Running initialization method");
		return 5;
	}

}
