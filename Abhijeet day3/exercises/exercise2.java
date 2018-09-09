import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		char tmp = s.charAt(s.length()-1);
		
		if(tmp == '{' ||tmp == '}' ||tmp == ')' ||tmp == ';')
			System.out.println("Yes one of { ,}, ), ; ");
		
		else if(Character.isAlphabetic(tmp) || Character.isAlphabetic(tmp))
			System.out.println("Yes it is a character");
		else System.out.println("No");
		

	}

}
