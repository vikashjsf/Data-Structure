//Length of the longest substring with consecutive characters
package com.interview;

public class ElongestSubstringWithConsecutiveCharacters {
	public static void main(String[] args) {
		String str = "zabcdabcabdefghijklmn";
		int len = str.length();
		longestSubString(str,len);
	}
	
	
	public static void longestSubString(String str, int len) {
		int subLen=0;
		int i=0;
		int endIndex=0;
		String str1="";
		while(i < len) {
			endIndex=getTheEndIndex(i, str,len);
			str1 = str.substring(i, endIndex);
			System.out.println("subString:"+str1);
			if(subLen < str1.length()) {
				subLen=str1.length();
			}
			i=endIndex;
		}
		System.out.println("Length of the longest subString : "+subLen);
	}
	
	public static int getTheEndIndex(int startingIndex,String str,int len) {
		//String str1 = "abcab";//[0,1,2,3,4]
		startingIndex++;
		while(startingIndex < len) {
			char current = str.charAt(startingIndex);
			char prev = str.charAt(startingIndex-1);
			if(current-prev==1) {
				startingIndex++;
			}else {
				break;
			}
		}
		return startingIndex;
	}
	
}
