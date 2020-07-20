package com.stream.practice.count;

import java.util.ArrayList;

public class TestCount {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(5);
		marks.add(10);
		marks.add(45);
		marks.add(50);
		marks.add(25);
		marks.add(30);
		System.out.println(marks);
		//when we want to count of objects on specific condition then we should go for count().
		long failedStudents = marks.stream().filter(m->m<35).count();
		System.out.println(failedStudents);

	}

}
