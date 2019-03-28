package com.JH.array1;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest_6 {

	public static void main(String[] args) {

		// 
		//1. 학생등록
		// 학생수 입력, 학생 번호 입력, 학생 이름 입력 , 학생 국영수 점수 입력
		//2. 전체 정보 조회
		// 모든 학생 번호, 이름, 국어, 영어, 수학 출력
		//3. 학생정보 검색 (한사람만)
		// 검색할 학생의 번호 입력
		// 검색한 학생의 번호, 이름, 국영수 출력
		//4. 프로그램 종료

		Scanner sc = new Scanner(System.in);

		String [] name = null; //학생이름
		int [] number = null;// 학생 번호
		int [] kor = null; // 국어점수
		int [] eng = null;// 영어점수
		int [] math = null; // 수학점수
		int stuNum = 0; //학생 수
		int [] totals = null;
		int tem = 0;
		String temN = null;

		boolean check = true;
		while (check) {
			System.out.println("1. 학생등록");
			System.out.println("2. 전체 정보 조회");
			System.out.println("3. 학생정보 검색");
			System.out.println("4. 전체 정보 총점 순으로 출력");
			System.out.println("5. 프로그램 종료");

			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("학생등록");
				System.out.println("학생 수 입력");
				stuNum = sc.nextInt();


				name = new String[stuNum];
				number = new int[stuNum];
				kor = new int[stuNum];
				eng = new int[stuNum];
				math = new int[stuNum];
				totals = new int[stuNum];
				for(int i = 0; i<name.length; i++) {
					System.out.println(i+1 + " 번째 학생 이름 입력");
					name[i] = sc.next();
					System.out.println(i+1 + " 번째 학생 번호 입력");
					number[i] = sc.nextInt();
					System.out.println(i+1 + " 번째 학생 국어 점수 입력");
					kor[i] = sc.nextInt();
					System.out.println(i+1 + " 번째 학생 영어 점수 입력");
					eng[i] = sc.nextInt();
					System.out.println(i+1 + " 번째 학생 수학 점수 입력");
					math[i] = sc.nextInt();
					totals[i] = kor[i] + eng[i] + math[i];
					System.out.println();
				}//1. 학생 등록 끝
				break;
			case 2:
				System.out.println("전체정보 조회");
				for(int i = 0; i<name.length; i++) {
					System.out.println(i+1 + " 번째 학생 이름 : " + name[i]);
					System.out.println(i+1 + " 번째 학생 번호 : " + number[i]);
					System.out.println(i+1 + " 번째 학생 국어 점수 : " + kor[i]);
					System.out.println(i+1 + " 번째 학생 영어 점수 : " + eng[i]);
					System.out.println(i+1 + " 번째 학생 수학 점수 : " + math[i]);
					System.out.println();


				}
				break;
			case 3:
				System.out.println("학생 정보 검색 ");
				int search = sc.nextInt();
				System.out.println(search + "번 학생 이름 : " + name[search]);
				System.out.println(search + "번 학생 번호 : " + number[search]);
				System.out.println(search + "번 학생 국어 점수 : " + kor[search]);
				System.out.println(search + "번 학생 영어 점수 : " + eng[search]);
				System.out.println(search + "번 학생 수학 점수 : " + math[search]);
				System.out.println();
				break;

			case 4:

			
					
				
				for(int i =0;i<name.length;i++ ) {
					System.out.println(i+1 + " 번째 학생 이름 : " + name[i]);
					System.out.println(i+1 + " 번째 학생 번호 : " + number[i]);
					System.out.println(i+1 + " 번째 학생 국어 점수 : " + kor[i]);
					System.out.println(i+1 + " 번째 학생 영어 점수 : " + eng[i]);
					System.out.println(i+1 + " 번째 학생 수학 점수 : " + math[i]);
					System.out.println();
				}
		

				break;


			case 5:
				System.out.println("프로그램 종료");
				check = false;
				break;

			}


		}

	}

}
