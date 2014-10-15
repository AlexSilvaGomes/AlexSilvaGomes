package certpal_test1;
public class Gened{

  public static void main(String argv[]){
   // doNumber(2); error here ambiguous 
    /*doNumber(2L);
    doNumber(new int[]{1,2,3,4});
    doNumber(new Integer(2));
    doNumber(new Integer[2]);*/
  }

 

  public static void doNumber(int... dn){
    System.out.print("b");
  }

  

  public static void doNumber(Integer... dn){
    System.out.print("d");
  }

  
}

