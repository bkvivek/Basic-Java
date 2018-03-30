package programs;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _21_Portfolio {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line;

		line = in.nextLine();
		in.close();
		ArrayList<String> pl = new ArrayList<String>();
		ArrayList<String> bl = new ArrayList<String>();
		String[] num = line.split(":|;|,|\\|");
		int count = 0;
		for(String s : num) {
			if(s.equals("BENCH")) {
				count++;
			}
			if(count>0 && !s.equals("BENCH")){						//Bench
				bl.add(s);
			}
			else if(count<1 && !s.equals("PORT")) {			//Port
				pl.add(s);
			}
		}
		double navPort=0, navBench=0, navP, navB;
		LinkedHashMap<String, Double> port = new LinkedHashMap<String, Double>();
		LinkedHashMap<String, Double> bench = new LinkedHashMap<String, Double>();

		for(int i=1; i<pl.size(); i+=3) {
			navPort += Double.parseDouble(pl.get(i))*Double.parseDouble(pl.get(i+1));
		}
		for(int i=1; i<bl.size(); i+=3) {
			navBench += Double.parseDouble(bl.get(i))*Double.parseDouble(bl.get(i+1));
		}
		for(int i=0; i<pl.size(); i+=3) {
			navP = (Double.parseDouble(pl.get(i+1))*(Double.parseDouble(pl.get(i+2))*100))/navPort;
			port.put(pl.get(i), navP);
		}
		for(int i=0; i<bl.size(); i+=3) {
			navB = (Double.parseDouble(bl.get(i+1))*(Double.parseDouble(bl.get(i+2))*100))/navBench;
			bench.put(bl.get(i), navB);
		}
		Map<String, Double> res = new TreeMap<String, Double>();
		for(String key : port.keySet()) {
			if(bench.containsKey(key)) {
				double d = port.get(key)-bench.get(key);
				res.put(key, d);
			}
			else {
				res.put(key, port.get(key));
			}
		}
		for(String key : bench.keySet()) {
			if(!res.containsKey(key)) {
				res.put(key, bench.get(key)*(-1));
			}
		}
		ArrayList<String> al = new ArrayList<>();
		for(String key: res.keySet()) {
			al.add(key);
			double d = res.get(key);
			al.add(String.valueOf(d));
		}
		System.out.println(navPort);
		System.out.println(navBench);
		System.out.println(port);
		System.out.println(bench);
		System.out.println(pl);	
		System.out.println(bl);
		System.out.println(res);
		System.out.println(al);
		System.out.print(al.get(0));
		NumberFormat nf = new DecimalFormat("#0.00"); 
		for(int i=1; i<al.size()-1; i++) {
			if(i%2!=0) {
				System.out.print(":");
			}
			else {
				System.out.print(",");
			}
			if(i%2!=0) {
				double x = Double.parseDouble(al.get(i));
				System.out.print(nf.format(x));
			}
			else {
				System.out.print(al.get(i));
			}

		}
		double y = Double.parseDouble(al.get(al.size()-1));
		System.out.print(":"+nf.format(y));
	}
}
//PORT:AXN,10,10;BGT,20,30;CXZ,10,30|BENCH:AXN,50,10;BGT,30,30;DFG,30,20


