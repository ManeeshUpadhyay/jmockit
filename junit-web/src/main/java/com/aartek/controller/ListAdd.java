package com.aartek.controller;

import java.util.List;

public class ListAdd {

	public int add(List<Integer> list) {

		int sum = 0;
		for (Integer integer : list) {

			sum = sum + integer;

		}
		System.out.println(sum);

		return sum;
	}

}
