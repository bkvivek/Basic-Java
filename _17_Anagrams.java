package programs;

import java.util.HashMap;
import java.util.Scanner;

public class _17_Anagrams {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
	static boolean isAnagram(String aa, String bb) {
		HashMap<Character, Integer> ha = new HashMap<>();
		String a = aa.toLowerCase();
		String b = bb.toLowerCase();
		for(char c : a.toCharArray()) {
			if(ha.containsKey(c)) {
				ha.put(c, ha.get(c)+1);
			}
			else {
				ha.put(c, 1);
			}
		}
		for(char c : b.toCharArray()) {
			if(ha.containsKey(c)) {
				if(ha.get(c)>1) {
					ha.put(c, ha.get(c)-1);
				}
				else {
					ha.remove(c);
				}
			}
			else {
				return false;
			}
		}
		return ha.isEmpty() ? true : false;

	}

}
