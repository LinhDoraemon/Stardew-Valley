package com.LinhDoraemon.utils;

import java.util.List;

public class TopNumber {

	public static int getMaxNumber(List<Integer> list) {
		
		int MIN_VALUE = 0;
		
		for(int i = 0; i < list.size(); i++) {
			
			int so = list.get(i);
			if(so > MIN_VALUE) {
				MIN_VALUE = so;
			}
			
		}
		
		return MIN_VALUE;
		
	}
	
	
	
}
