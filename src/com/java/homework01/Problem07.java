package com.java.homework01;


import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {

	
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("=====================");
		System.out.println("   [숫자맞추기게임 시작]   ");
		System.out.println("=====================");
	

		int bingo= (int)(Math.random()*5+1);           //1부터 100까지 범위지정 .... (Math.random()*최댓값+시작 값);
		
		
		while(true) {
			
			System.out.println(">>");
			int num = sc.nextInt();
			
			if(num==bingo) {
				System.out.println("정답입니다.");
				System.out.println("종료하시겠습니까?(y/n) >>");
				
				sc.nextLine();
				String jong= sc.nextLine();
				
				if(jong.equals("n")) {
					continue;
				}
				else if(jong.equals("y")) {
					
					System.out.println("=====================");
					System.out.println("   [숫자맞추기게임 종료]   ");
					System.out.println("=====================");
					sc.close();
					break;
				}
			}
				else if(num>bingo) {
					
					System.out.println("더 낮게");
					
					
				}
				
				else {
					
					System.out.println("더 높게");
					
			}
			
		
			}
				
			
			
		}
		
		
	
	}


