package regex_formatter_classes;

/**
 * 
 * Class to test the printf command from Formatter class.
 * @author Alex
 *
 */
public class PrintfTesteClass {

	 public static void main(String[] args) {
		float f = -12323.00f;
		int i = 12345538;
		boolean b = true;
		String s = "Alex";
		
		System.out.printf(">%+,12.2f<", f);
		System.out.printf("\n>%1$0 +,20d<",i );
		System.out.printf("\n>%1$10s<",s);
		System.out.printf("\n>%1$-10b<",b);
	}
}
