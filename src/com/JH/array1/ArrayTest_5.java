package com.JH.array1;

import java.util.Scanner;

public class ArrayTest_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생수를 입력 -> 3명
		//입력한 수 만큼의 학생의 이름을 입력
		// 내가 입력한 학생수 만큼 이름 출력

		System.out.println("학생수 입력");
		int num = sc.nextInt();
		String [] name = new String[num]; // 학생 이름
		int [] kor = new int[num]; // 학생 점수
		int [] math = new int [num];
		int kors =0;
		int maths = 0;

		for(int i = 0; i<name.length; i++) {
			System.out.println(i+1 +"번째 학생 이름 입력");
			name[i] = sc.next();

		} // 학생 입력
		for(int i=0; i<kor.length; i++) {
			System.out.println(name[i] + " 학생의 국어 점수 입력 ");
			kor[i] = sc.nextInt();
			kors += kor[i];
		} // 학생 국어점수 입력

		for(int i =0; i<math.length; i++) {
			System.out.println(name[i] + " 학생의 수학 점수 입력 ");
			math[i] = sc.nextInt();
			maths += math[i];
		}


		System.out.println("국어 반평균 점수 : " + kors/kor.length);
		System.out.println("수학 반평균 점수 : " + maths/math.length);

	}


}
