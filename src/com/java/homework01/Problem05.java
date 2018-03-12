package com.java.homework01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");

		int i = 1;
		int max = 0;

		for (i = 1; i <= 5; i++) {

			System.out.print("숫자: ");
			int num = sc.nextInt();

			if (num > max) {

				max = num;
			}

		}

		System.out.println("최대값은 " + max + " 입니다.");

		sc.close();
	}

}

// 변수5개를 설정한 후 반복문으로 돌아가면서 채워넣기가 가능한가?

// 아니다 최대값을 구하는 거니까 값을 다 저장해서 비교할 필요 없이 하나씩 비교해서 버리고 큰 값을 남기면 되겠다.
