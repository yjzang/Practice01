package com.java.homework01;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int num=sc.nextInt();
		int i=1;
		int t=1;
				
		
		for(i=1;i<=num;i++) {
			
			
			for(t=1;t<=i;t++) {
			System.out.print(i);
			}	
			
			System.out.println(" ");
			
		}
	
			
		sc.close();
		
				
	
		
	}

}

//원하는 횟수만큼 돌리는 법

//while은 횟수가 정해져있지 않을때라고 했는데.. 무식하게 조건내에서 계속 돌리는 경우..는 와일이다. 무조건 1부터 규칙성있게 돌릴때..
//수열이 정해져있고 n값을 제어?

// print("\n") 과 println(" ") 은 같은 효과다. ln 붙으면 한줄 띄워줌.