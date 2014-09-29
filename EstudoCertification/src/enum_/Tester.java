package enum_;


/**
 * @author ALSGomes
 *
 */
public class Tester {
	 public static void main(String [] args) {
	 System.out.println(Status.Published.index + Status.Rejected.index); // Line 10	 	 
	 
	 }
	 
	 // Pay attention to this
	 // it's permitted to put a semicolon (;) it doesn't lead to a compile error.
	 public void getNumber(){;} // #1
}