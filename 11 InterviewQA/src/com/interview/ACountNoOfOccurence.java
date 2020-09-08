package com.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ACountNoOfOccurence {
	public static void main(String[] args) {
		 
        String str = "JavaExamplesJavaCodeJavaProgram";
        String strFind = "Java";
        countNoOfSubStringInAParentString(str, strFind);
        countNo(str, strFind);
        countString(str, strFind);
	}
	
	public static void countNoOfSubStringInAParentString(String str, String strFind) {
		int count = 0, fromIndex = 0;
		while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1) {
			count++;
			fromIndex++;
		}
		System.out.println("Total occurrences: " + count);
	}
	
	public static void countNo(String str, String strFind) {
		int count = str.split(strFind, -1).length;
		System.out.println("Total occurrences: " + (count-1));
	}
	public static void countString(String str,String strFind) {
		int count = 0, startIndex = 0;
		Pattern p = Pattern.compile("Java", Pattern.LITERAL);
		Matcher m = p.matcher(str);
		while(m.find(startIndex)){
		    count++;
		    startIndex = m.start() + 1;
		}
		System.out.println("Total occurrences: " + count);
	}
}
//https://www.javacodeexamples.com/java-count-occurrences-of-substring-in-string-example/724