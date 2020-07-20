package com.stream.practice.minmax;

import java.util.ArrayList;

public class TestMinMax {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(15);
		l.add(10);
		System.out.println(l);
		//ASC/DNSO
		//Integer min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		//DESC/CSO
		Integer min = l.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println(min);
		//ASC/DNSO
		//Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		//DESC/CSO
		Integer max = l.stream().max((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println(max);
	}

}
