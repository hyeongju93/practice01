package com.javaex.practice;

import java.util.Scanner;

public class Practice08 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		int total=0;
		int flag=0;
		
		while(flag==0) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("----------------------------");
			num=sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("예금액>");
				num=sc.nextInt();
				total+=num;
				break;
			case 2:
				System.out.print("출금액>");
				num=sc.nextInt();
				total-=num;
				break;
			case 3:
				System.out.print("잔고액>");
				System.out.println(total);
				break;
			case 4:
				System.out.println("프로그램 종료");
				flag=1;
				break;
			default:
				System.out.println("다시입력해주세요");	
			
			}
			
			
			
			
				
		}
	}

}
