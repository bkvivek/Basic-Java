package programs;

import java.util.Scanner;
import java.util.Stack;

public class _12_BalancedBrackets {

	public static boolean isBalanced(String expression) {
		if (expression.length()%2 != 0) return false;
		else {
			char[] ch = expression.toCharArray();
			Stack<Character> s = new Stack<>();
			for(char c: ch) {
				switch (c) {
				case '{':
					s.push('}');
					break;
				case '[':
					s.push(']');
					break;
				case '(':
					s.push(')');
					break;

				default:
					if(s.empty() || c != s.peek()) {
						return false;
					}
					s.pop();					
					break;
				}
			}
			return s.empty();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
		}
	}

}
