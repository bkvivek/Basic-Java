package programs;

import java.util.Scanner;

public class _26_PalindromeScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] c1 = s.toCharArray();
		String s2 = new StringBuilder(s).reverse().toString();
		char[] c2 = s2.toCharArray();
		scan.close();
		int n=0;
		for(int i=0; i<c1.length/2; i++) {
			if(c1[i]!=c2[i]) {
				n++;
				n++;
			}
		}
		System.out.println("Palindrome score: "+n);
	}
}
