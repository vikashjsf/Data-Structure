package com.interview;

import java.lang.instrument.Instrumentation;

public class FObjectSizeEvaluation {
	private int x;
	private int y;

	public static void main(String[] args) {
		System.out.println(ObjectSizeFetcher.getObjectSize(new FObjectSizeEvaluation()));
	}
}

class ObjectSizeFetcher {
	private static Instrumentation instrumentation;

	public static void premain(String args, Instrumentation inst) {
		System.out.println("------Premain-------");
		instrumentation = inst;
	}

	public static long getObjectSize(Object o) {
		return instrumentation.getObjectSize(o);
	}
}