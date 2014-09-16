package regex_formatter_classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CertRegex
{
    public static void main(String[] args) throws Exception 
    {
        Pattern pattern = Pattern.compile(".");
        Matcher matcher = pattern.matcher("xx.YY.ZZ");
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
