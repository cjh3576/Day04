package com.JH.array2;

import java.util.Arrays;

public class Array_3_test4 {

	public static void main(String[] args) {
		int [] num1 = {1, 2, 3};
		int [] num2 = {4, 5, 6};
		int [][] nums = new int[2][3];
		nums [0] = num1;
		nums [1] = num2;

		System.out.println(nums[0][1]);
		System.out.println(nums[1][0]);
		
		System.out.println("test");


	}

}
