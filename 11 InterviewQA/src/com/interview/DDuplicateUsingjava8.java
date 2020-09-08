package com.interview;

import java.util.Arrays;
import java.util.stream.Stream;

public class DDuplicateUsingjava8 {
	public static void main(String[] args) {
		String[] arryStr = { "wipro", "wipro", "digi", "done", "start", "digi" };
		Stream.of(arryStr).distinct().forEach(str -> System.out.println(str));
		int count = (int) Stream.of(arryStr).distinct().count();
		System.out.println(count);
		Arrays.asList(arryStr).stream().distinct().forEach(s -> System.out.println(s));
	}
}
