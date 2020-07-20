package com.stream.practice.sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestSorted {

	public static void main1(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(5);
		marks.add(10);
		marks.add(45);
		marks.add(50);
		marks.add(25);
		marks.add(30);
		System.out.println(marks);
		//when we want to sort a group of object in DNSO then we should go for sorted().
		//List<Integer> ascMarks = marks.stream().sorted().collect(Collectors.toList());
		//List<Integer> ascMarks = marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		//List<Integer> ascMarks = marks.stream().sorted((i1,i2)->(i1<i2)?-1:(i1>i2)?1:0).collect(Collectors.toList());
		//System.out.println(ascMarks);
		//when we want to sort a group of object in reverse of DNSO then we should go for sorted(Comparator).
		List<Integer> descMarks = marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		//List<Integer> descMarks = marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		//List<Integer> descMarks = marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(descMarks);

	}
	
	public static void main(String[] args) {
		ArrayList<String> sl = new ArrayList<String>();
		
		/*
		 * sl.add("Sunny"); sl.add("Kajal"); sl.add("Prabhas"); sl.add("Anushka");
		 * sl.add("Mallika");
		 */
		 
		/*
		 * sl.add("Sunny Leone"); sl.add("Kajal Agarwal"); sl.add("Prabhas");
		 * sl.add("Anushka Shetty"); sl.add("Mallika Sherawat");
		 */
		
		  sl.add("AA"); sl.add("A"); sl.add("AAAAA"); sl.add("AAA"); sl.add("AAAA");
		  //sl.add("AAA");
		  //sl.add("XXX");
		 
		System.out.println(sl);
		
		Comparator<String> c = (s1, s2) -> {
			int l1 = s1.length();
			int l2 = s2.length();
			if (l1 < l2)
				return 1;
			else if (l1 > l2)
				return -1;
			else
				return s1.compareTo(s2);
		};
		 
		//List<String> sortedList = sl.stream().sorted().collect(Collectors.toList());
		List<String> sortedList = sl.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
