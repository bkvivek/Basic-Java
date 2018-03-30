package programs;

import java.util.Scanner;

public abstract class _16_StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder s = new StringBuilder(A);
        String rs = s.reverse().toString();
        if(A.equals(rs)) {
        	System.out.println("Yes");
        }
        else System.out.println("No");       
	// System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
	}

}
