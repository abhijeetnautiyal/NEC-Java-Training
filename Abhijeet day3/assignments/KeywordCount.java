
import java.util.Arrays;
import java.util.Scanner;


public class KeywordCount {

    
    public static void main(String[] args) {
        
        
    
        String[] keywords = { "abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while" };
        String used[]= new String[100];
        int ind=0;
        
        
        for(String word:args)
        {
            if(Arrays.binarySearch(keywords, word)>=0)
            {
                used[ind++] = word;
            }
        }
        System.out.println("No. of keywords used : "+ ind);
        System.out.println("All keyword used are:");
        for(int i=0;i<ind;i++)
        {
            System.out.println(used[i]);
        }
        
        
        
        
    }
    
}
