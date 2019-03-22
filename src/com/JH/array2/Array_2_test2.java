package com.JH.array2;
import java.util.Scanner;
public class Array_2_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 심판 5명 / 정수 / 평균
		int[] points = new int[5];
		for(int i=0;i<points.length;i++) {
			System.out.println(1+i + " 번 점수 입력");
			points[i] = sc.nextInt();
		}
		int max= points[0];
		int min= points[0];
		int total = 0;
		int avg = 0;
		
		for(int i=0; i<points.length; i++) {
			if(max<points[i]) max = points[i];
			if(min>points[i]) min = points[i];
			total = total + points[i];
			avg = (total - max - min)/(points.length-2);
			
			
		}
		
		System.out.println("최대 최소 점수 제외한 평균 : " + avg);
	}

}
