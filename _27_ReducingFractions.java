package programs;

import java.util.StringTokenizer;

public class _27_ReducingFractions {

	public static void main(String[] args) {
		String s1 = "358/472";
		String s2 = "301/417";
		StringTokenizer st1 = new StringTokenizer(s1, "/");
		StringTokenizer st2 = new StringTokenizer(s2, "/");
		int n1 = Integer.parseInt(st1.nextToken());
		int d1 = Integer.parseInt(st1.nextToken());
		int n2 = Integer.parseInt(st2.nextToken());
		int d2 = Integer.parseInt(st2.nextToken());
		int n,d,max,gcd=1;
		if(d1==d2) {
			d=d1;
			n=n1+n2;
		}
		else {
			d=d1*d2;
			n=n1*d2+n2*d1;
		}
		System.out.println(n+"/"+d);
		max = n<d ? n : d;
		for(int i=2; i<=max; i++) {
			if(n%i==0 && d%i==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
		System.out.println("Lowest fraction form: "+n/gcd+"/"+d/gcd);
	}

}
