package programs;

import java.util.Scanner;

public class _09_StaticInitializerBlock {
	static boolean flag;
	static int B,H;
	static {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breadth: ");
		B = sc.nextInt();
		System.out.println("Enter height: ");
		H = sc.nextInt();
		sc.close();
		if(B>0 && H>0) {
			flag = true;
		}
		else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print("Area is: "+area);
		}

	}

}
