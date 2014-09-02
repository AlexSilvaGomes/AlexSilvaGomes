package regex_formatter_classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Learning how to deal with greedy quantifiers 
 * 
 * @author ALSGomes
 *
 */
public class RegexGreedyTest {
	
	public static void main(String[] args) {
	
		Pattern pat = Pattern.compile(".*?xx");
		Matcher mat = pat.matcher("yyxxxyxx");
	
      while(mat.find()){   	  
 
    	  System.out.println("Start:"+mat.start());
       	  System.out.println("Group..:"+mat.group());   	  
      }
	}
	
}
