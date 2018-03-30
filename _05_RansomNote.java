package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_RansomNote {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Magazine Length: ");
		int magazineLength = in.nextInt();
		System.out.println("Enter the Ransom Length: ");
		int ransomLength = in.nextInt();
		System.out.println("Enter the Magazine words: ");
		String magazine[] = new String[magazineLength];
		for(int magazine_i=0; magazine_i < magazineLength; magazine_i++){
			magazine[magazine_i] = in.next();
		}
		System.out.println("Enter the Ransom words: ");
		String ransom[] = new String[ransomLength];
		for(int ransom_i=0; ransom_i < ransomLength; ransom_i++){
			ransom[ransom_i] = in.next();
		}
		in.close();
		Map<String, Integer> check = new HashMap<String, Integer>();

		for(int i=0; i<magazine.length; i++){
			if(check.containsKey(magazine[i])){
				check.put(magazine[i], check.get(magazine[i])+1);
			}
			else{
				check.put(magazine[i], 1);
			}
		}

		for(int i=0; i<ransom.length; i++){
			if(check.containsKey(ransom[i])){
				if(check.get(ransom[i])>1){
					check.put(ransom[i], check.get(ransom[i])-1);
				}
				else{
					check.remove(ransom[i]);
				}
			}
			else{
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}

}
