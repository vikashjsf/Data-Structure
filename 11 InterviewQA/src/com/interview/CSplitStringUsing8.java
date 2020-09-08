package com.interview;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CSplitStringUsing8 {
	public static void main(String[] args) {
		String str="this,is,super,computer";
		Pattern.compile(",").splitAsStream(str).forEach(s->System.out.print(s +" "));
		System.out.println();
		//spliStringUsing8(str);
	}
	
	public static void spliStringUsing8(String str) {
		Pattern pattern = Pattern.compile(",");
		
		//Spiting string by comma and converting into the stream
		Stream<String> stream = pattern.splitAsStream(str);
		stream.forEach(s->System.out.print(s +" "));		
	}
}
