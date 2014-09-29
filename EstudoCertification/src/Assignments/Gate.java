package Assignments;


/**
 * @author ALSGomes
 * This class will throw a runtime exception , because eye is not initialized properly and it get a null value.
 */
public class Gate  
{
    Integer eye;
    int i;
    public static void main(String... args)
    {
        new Gate().go(new Integer(10));
    }
    
    public void go(int y) 
    {
        i = y + eye;
        System.out.println(i);
    }
}