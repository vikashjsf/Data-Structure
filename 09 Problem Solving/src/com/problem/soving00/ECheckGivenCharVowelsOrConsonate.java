package com.problem.soving00;

import java.util.regex.Pattern;

public class ECheckGivenCharVowelsOrConsonate {
	public static void main(String[] args) {
		char ch = 'i';
		checkVolelsOrConsonate(ch);
		checkVolesOrCons(ch);
	}
	
	public static void checkVolelsOrConsonate(char ch) {
		ch = Character.toLowerCase(ch);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
			System.out.println(ch + " is Vowels");
		}else {
			System.out.println(ch +" Consonate");
		}
	}
	
	//Using Pattern matcher
	public static void checkVolesOrCons(char ch) {
		boolean status = Pattern.matches("[aeiou]", Character.toString(ch));
		if(status)
			System.out.println(ch + " is vowels!!");
		else
			System.out.println(ch + " is Consonate!");
	}
}
