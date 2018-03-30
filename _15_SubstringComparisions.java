package programs;

import java.util.Arrays;
import java.util.Scanner;

public class _15_SubstringComparisions {

	public static String getSmallestAndLargest(String s, int k) {
		int len = s.length();
		int n = len-k+1;
		String[] ss = new String[n];
		for(int i=0; i<n; i++) {
			ss[i] = s.substring(i, i+k);
		}
		Arrays.sort(ss);
		String smallest = ss[0];
		String largest = ss[n-1];		
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

}
