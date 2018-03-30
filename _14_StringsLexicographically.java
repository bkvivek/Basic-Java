package programs;

import java.util.Scanner;

public class _14_StringsLexicographically {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        System.out.println(A.length()+B.length());
        char[] aa = A.toCharArray();
        char[] bb = B.toCharArray();
        
        if(aa[0]>bb[0]) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
        
        String aA = A.substring(0, 1).toUpperCase()+A.substring(1);
        String bB = B.substring(0, 1).toUpperCase()+B.substring(1);
        
        System.out.println(aA+" "+bB);
	}

}
