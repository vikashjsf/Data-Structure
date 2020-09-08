//Calculate sum of all numbers present in a string
package com.problem.soving01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GSumOfDigitInAString {
	public static void main(String[] args) {
		String str="1abc23";
		sumOfNumber(str);
		sumOfNumber1(str);
	}
	
	public static void sumOfNumber(String str) {
		char[] ch = str.toCharArray();
		int sum = 0;
		for (char c : ch) {
			if(Character.isDigit(c)) {
				int num = Integer.parseInt(Character.toString(c));
				sum = sum+num;
			}
		}
		System.out.println("Sum : "+sum);
	}
	
	public static void sumOfNumber1(String str) {
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(str);
		int sum = 0;
		while(matcher.find()) {
			sum = sum + Integer.parseInt(matcher.group());
		}
		System.out.println("Sum : "+sum);
	}
}
