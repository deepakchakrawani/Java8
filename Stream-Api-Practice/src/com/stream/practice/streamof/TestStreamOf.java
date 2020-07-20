package com.stream.practice.streamof;

import java.util.stream.Stream;

public class TestStreamOf {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(9,99,999,9999,99999);
		
		s.forEach(System.out::println);

	}

}
