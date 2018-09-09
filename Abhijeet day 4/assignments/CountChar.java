

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class CountChar {
    
    public static int count(String regex, String text)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        
        while(matcher.find()) 
            count++;
        
        return count;
        
    }
    
        
    public static void main(String[] args) {
    
        String nos = "[0-9]";
        String letters = "[a-zA-Z]";
        String spaces = "[\\s]";
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.println("No of digits : "+count(nos, s));
        System.out.println("No of letters: "+count(letters, s));
        System.out.println("No of spaces : "+count(spaces, s));
    }
    

}