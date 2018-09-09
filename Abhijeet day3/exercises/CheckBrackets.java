
public class CheckBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] stk = new char[100];
		int ind=0;
		
		String inpStr="\r\n" + 
				"public class VarargsTest {\r\n" + 
				"	\r\n" + 
				"	static void fun(int...a)\r\n" + 
				"	{\r\n" + 
				"		System.out.println(\"No of arguments: \"+a.length);\r\n" + 
				"		\r\n" + 
				"		for(int i:a)\r\n" + 
				"			System.out.print(i+\" \");\r\n" + 
				"		\r\n" + 
				"		System.out.println();\r\n" + 
				"		\r\n" + 
				"	}\r\n" + 
				"	static void fun2(String s,int...a)\r\n" + 
				"	{\r\n" + 
				"		System.out.println(\"No of variable arguments: \"+a.length);\r\n" + 
				"		\r\n" + 
				"		System.out.println(\"String :\"+s);\r\n" + 
				"		\r\n" + 
				"		for(int i:a)\r\n" + 
				"			System.out.print(i+\" \");\r\n" + 
				"		\r\n" + 
				"		System.out.println();\r\n" + 
				"		\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	public static void main(String[] args) {\r\n" + 
				"		// TODO Auto-generated method stub\r\n" + 
				"		\r\n" + 
				"		fun2(\"gfk\",100,200);\r\n" + 
				"		fun2(\"csPortal\",1,2,3,4);\r\n" + 
				"		fun2(\"for geeks\");\r\n" + 
				"\r\n" + 
				"	\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"";
		char tmp;
		for(int i=0;i<inpStr.length(); i++)
		{
			tmp = inpStr.charAt(i);
			if(inpStr.charAt(i) == '{' || inpStr.charAt(i) == '(' || inpStr.charAt(i) == '[' ) stk[ind++]=inpStr.charAt(i);
			else if(inpStr.charAt(i) == '}' || inpStr.charAt(i) == ')' || inpStr.charAt(i) == ']' ) 
				{
				if(ind == 0) 
					{System.out.println("Brackets not balanced.");
					System.exit(0);}
				else ind--;}
			
			
		}
		if(ind ==0) System.out.println("Brackets are balanced.");
		else System.out.println("Brackets not balanced");

	}

}
