package com.problem.soving01;

public class HDuckNumberCheck {
	public static void main(String[] args) {
		String[] numbers = {"102305","011203","10203","012050","7806030","010809"};
		for (String num : numbers) {
			checkDuckNumber(num);
		}
	}
	
	public static void checkDuckNumber(String str) {
		char[]ch = str.toCharArray();
		char first = ch[0];
		int count=0;
		for (char c : ch) {
			if(c=='0') {
				count++;
			}
		}
		if(count > 0 && first!='0') {
			System.out.println(str + " is Dock number!!");
		}else {
			System.out.println(str + " is not Dock Number!!!");
		}
	}
}

/*
 Duck Number
 A Duck number is a number which has zeroes present in it, but there should be no zero 
 present in the beginning of the number. For example 3210, 7056, 8430709 are 
 all duck numbers whereas 08237, 04309 are not.
*/
