
package com.problem.soving01;

public class ARemoveVowels {
	public static void main(String[] args) {
		String str = "amit is from ranchi";
		System.out.println(removeVowels(str));
	}
	
	public static String removeVowels(String str) {
		StringBuilder builder = new StringBuilder();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if(!isVowel(c)) {
				builder.append(c);
			}
		}
		return builder.toString();
	}
	
	public static boolean isVowel(char c) {
		String str = "aeiouAEIOU";
		if(str.contains(Character.toString(c))) {
			return true;
		}
		return false;
	}
}
