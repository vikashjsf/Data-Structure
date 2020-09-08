package com.problem.soving00;

public class ILCM {
	public static void main(String[] args) {
		int first = 72;
		int second = 120;
		lcm(first, second);
		otherWayLcm(first,second);
	}
	
	public static void lcm(int first , int second) {
		int gcd = 1; 
		int t1 = first ;
		int t2 = second;
		while(first!=second) {
			if(first > second) {
				first = first  - second;
			}else {
				second = second - first;
			}
			gcd = first;
		}
		System.out.println("HCF of the given number is : "+gcd);
		int lcm = (t1 * t2) /gcd;
		System.out.println("LCM of given number is : "+lcm);
	}
	
	public static void otherWayLcm(int first, int second) {
		int lcm = first > second ? first : second;
		for (int i = lcm; ; i++) {
			if(i % first == 0 && i % second ==0) {
				System.out.println("LCM : "+lcm);
				break;
			}
			lcm++;
		}
	}
}
