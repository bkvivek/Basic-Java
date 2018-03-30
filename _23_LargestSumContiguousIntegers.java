package programs;

import java.util.Scanner;

public class _23_LargestSumContiguousIntegers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		in.close();
		String[] s = line.split(",");
		int[] num = new int[s.length];
		for(int i=0; i<s.length; i++){
			num[i] = Integer.parseInt(s[i].trim());
		}
		int max = 0, sum = 0;
		for(int i=0; i<num.length; i++){
			sum=0;
			if(num[i]>0) {
				for(int j=i; j<num.length; j++){

					sum += num[j];
					System.out.println(sum);
					if(sum>max){
						max = sum;
						System.out.println(max);
					}
				}
			}
		}
		//-10, 2, 3, -2, 0, 5, -15
		System.out.println(max);
	}

}
