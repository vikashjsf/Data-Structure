// Frequency of a character
package com.problem.soving00;

public class VFrequencyOfCharacter {
	public static void main(String[] args) {
		String str = "this is inida";
		char ch= 'i';
		int frequency = 0;
		for (int i = 0; i < str.length(); i++) {
			if(ch == str.charAt(i)) {
				frequency++;
			}
		}
		System.out.println("Frequency of the given character is : "+frequency);
	}
}
