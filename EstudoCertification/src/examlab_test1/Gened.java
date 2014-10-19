

package examlab_test1;
import static java.io.BufferedReader.*;

import java.util.HashMap;
import java.util.Map;
	
public class Gened{

  public static void main(String argv[]){	
	  //printFirst(new int[]{34});
    doNumber(2); //error here ambiguous 
    doNumber(2L);
    doNumber(new int[]{1,2,3,4});
    doNumber(new Integer(2));
    doNumber(new Integer[2]);
   
  }

 
  
 /* public static void printFirst(int... va){
	  System.out.println("Integer...");
      System.out.print(va[0]);
    }
    public static void printFirst(int[] aa){
    	System.out.println("int[]");
      System.out.print(aa[0]*2);
    }*/

  
  
  public static void doNumber(int... dn){
    System.out.print("b");
  }
  
  public static void doNumber(int dn){
	  
  }
  
  public static void doNumber(long dn){
	  
  }

  public static void doNumber(Integer... dn){
    System.out.print("d");
  }

  
}

