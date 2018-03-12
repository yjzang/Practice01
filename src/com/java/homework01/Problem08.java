package com.java.homework01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------");

		int sum = 0;

		while (true) {

			System.out.print("선택>");

			int num = sc.nextInt();

			switch (num) {

			case 1:
				System.out.println("예금액>");
				sum += sc.nextInt();                                          //int input = sc.nextInt(); sum = sum + input;  두줄짜리를 한줄로 줄여쓸 수 있다.
				System.out.println("다시 입력해주세요");
				continue;

			case 2:
				System.out.println("출금액>");
				int output = sc.nextInt();
				sum = sum - output;
				System.out.println("다시 입력해주세요");
				continue;

			case 3:

				System.out.println("잔고액> " + sum);
				System.out.println("다시 입력해주세요");
				continue;

			case 4:

				System.out.println("프로그램 종료");
				
				break;
			}
				
		}
	}

}
