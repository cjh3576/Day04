package com.JH.array1;

import java.util.Scanner;

public class ArrayTest_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar= {10, 32, 15, 27, 46, 52};
		
		System.out.println("몇번을 출력할까요");
		int num = sc.nextInt();
		
		
		if(num<0 || num>ar.length) {
		
		System.out.println("없는 번호 입니다");
		}
		else {
			System.out.println(ar[num]);
		}
	}

}
