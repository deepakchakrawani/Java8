package com.stream.practice.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		System.out.println(l);
		//when we want to filter objects from a group of object then we should go for filter().
		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);

	}

}
