package com.stream.practice.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		marks.add(30);
		System.out.println(marks);
		//when we want to manipulate a group of object then we should go for map().
		List<Integer> updatedMarks = marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
	}

}
