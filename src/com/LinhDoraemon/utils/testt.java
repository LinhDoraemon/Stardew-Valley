package com.LinhDoraemon.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class testt {

	public static void main(String[] args) {
		String[] s = {"s", "sss", "ss"};
		List<String> l = new ArrayList<>();
		l.addAll(Arrays.asList(s));
		System.out.println(l.toString());
	}

}
