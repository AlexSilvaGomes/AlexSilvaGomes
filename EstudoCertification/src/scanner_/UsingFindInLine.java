package scanner_;

import java.util.Scanner;

public class UsingFindInLine 
{
    public static void main(String... args) 
    {
        Scanner s = new Scanner("Hello my love");
        String token;
        do {
          token = s.findInLine("");
          System.out.print(token + " ");
        } while (token != null);    
    }    
}