package com.stream.practice.foreach;

import java.util.ArrayList;
import java.util.function.Consumer;

public class TestForEach {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(15);
		l.add(10);
		System.out.println(l);
		//l.stream().forEach(System.out::println);
		
		Consumer<Integer> c = i -> {
			System.out.println("The Square of " + i + " is : " + (i * i));
		};
		 
		
		
		  l.stream().forEach(i -> {
				System.out.println("The Square of " + i + " is : " + (i * i));
			});
		 
	}

}
