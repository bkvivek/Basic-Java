package programs;

import java.util.Scanner;

public class _04_InvertStarsPyramid {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter Number number of rows: ");
		int numOfRows = in.nextInt();
		in.close();
		int numOfSpaces=0;
		int numOfStars=2*numOfRows-1;
		while(numOfSpaces<numOfRows) {
			for(int i=0; i<2*numOfSpaces; i++) {
				System.out.print(" ");	
			}		
			for(int j=0; j<numOfStars; j++) {
				System.out.print("* ");
			}
			System.out.println("");
			numOfStars-=2;
			numOfSpaces++;
		}
	}

}
