package programs;

public class _25_PrimeNumbers {

	public static void main(String[] args) {
		int num;
		for(int j=1; j<100; j++) {
			num = j;
			int k=0;
			if(num==1 || num==2) {
				System.out.println(num+" Prime");
			}
			else {
				for(int i=2; i<=num/2; i++) {
					if(num%i==0) {
						k++;
					}
				}
			}
			if(k==0) {
				System.out.println(num+" Prime");
			}
			else {
				System.out.println(num+" Not Prime");
			}
		}
	}

}
