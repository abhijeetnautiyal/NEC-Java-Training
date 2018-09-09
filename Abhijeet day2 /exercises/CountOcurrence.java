import java.util.regex.*;
public class CountOcurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "\r\n" + 
				"public class exrecise1 {\r\n" + 
				"\r\n" + 
				"	public static void main(String[] args) {\r\n" + 
				"		// TODO Auto-generated method stub\r\n" + 
				"		\r\n" + 
				"		int a[][] = {{1,3}, {3,4,5}};\r\n" + 
				"		int b[][] = {{1,3,4},{3,4,5}};\r\n" + 
				"		\r\n" + 
				"		\r\n" + 
				"		int i,j;\r\n" + 
				"		\r\n" + 
				"		\r\n" + 
				"		for(i=0; i<a.length; i++)\r\n" + 
				"		{\r\n" + 
				"			for(j=0;j<a[i].length;j++)\r\n" + 
				"			{\r\n" + 
				"				b[i][j] += a[i][j];\r\n" + 
				"			}\r\n" + 
				"		}\r\n" + 
				"		\r\n" + 
				"		//sum print\r\n" + 
				"		for(i=0; i<b.length; i++)\r\n" + 
				"		{\r\n" + 
				"			for(j=0;j<b[i].length;j++)\r\n" + 
				"			{\r\n" + 
				"				System.out.print(b[i][j]+ \" \");\r\n" + 
				"			}\r\n" + 
				"			System.out.println();\r\n" + 
				"		}\r\n" + 
				"		\r\n" + 
				"		\r\n" + 
				"		\r\n" + 
				"		\r\n" + 
				"\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"";
		
        Pattern pattern = Pattern.compile("\\{");
        Matcher  matcher = pattern.matcher(str);

        int count = 0;
        while (matcher.find())
            count++;

        System.out.println("Ocuurences of { :"+ count); 
        Pattern pattern2 = Pattern.compile("\\}");
        Matcher  matcher2 = pattern2.matcher(str);

        int count2 = 0;
        while (matcher2.find())
            count2++;

        System.out.println("Ocuurences of } :"+ count2);  
		


	}

}
