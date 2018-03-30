package programs;

import java.util.Scanner;

public class _28_StringReverse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		in.close();
		System.out.println("Original String is: "+s1);
		char[] c = s1.toCharArray();
		String s2 = "";
		for(int i=c.length-1; i>=0 ; i--) {
			s2 = s2.concat(c[i]+"");
			// (or)
			// s2 += c[i] + ""; 
			// (or)
			//s2 = s2.concat(String.valueOf(c[i]));
		}
		System.out.println("Reversed String is: "+s2);
	}

}
