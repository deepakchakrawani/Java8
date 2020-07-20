package com.stream.practice.toarray;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TestToArray {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(15);
		l.add(10);
		//Integer[]::new constructor represation
		Integer[] intArray = l.stream().toArray(Integer[]::new);
		
		/*
		 * for (Integer i : intArray) { System.out.println(i); }
		 */
		 
		
		Stream.of(intArray).forEach(System.out::println);

	}

}
