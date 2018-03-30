package programs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _18_StringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer st = new StringTokenizer(s, "!,?._'@ ");
        scan.close();
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()) {
        	System.out.println(st.nextToken());
        }
	}

}
