package com.JH.array2;

import java.util.Arrays;

public class Array_3_test3 {

	public static void main(String[] args) {
		
		int [] points = {3, 5, 1, 9, 2};
		int tem = 0 ;
		/*
		for(int i = 0;  i <points.length; i++ ) {
			for(int j = 0; j<points.length; j ++) {
				if(points[i]<points[j]) {
					tem = points[i];
					points[i] = points[j];
					points[j] = tem;
				}
			}
		}
		*/
		Arrays.sort(points);
		
		for(int i = 0; i<points.length; i++)
			System.out.println(points[i]);
	}
}
