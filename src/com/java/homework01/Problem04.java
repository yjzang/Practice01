package com.java.homework01;

public class Problem04 {

	public static void main(String[] args) {

		int i = 1;
		int n = 1;

		for (n = 1; n <= 10; n++) {

			for (i = n; i <= n+10; i++) {

				System.out.print(i + "\t");

			}

			System.out.print("\n");

		
		}
	}

}



//너무 헤맸다.
// for문 안에꺼 먼저 완성 후 해당 세트를 반복하기위한 for문을 상위에 만들어주는 식으로..!