package com.javaex.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc=new Scanner(System.in);
		int best=0;
		int current;
		for(int i=0;i<5;i++) {
			System.out.print("숫자: ");
			current=sc.nextInt();
			if(i==0) {
				best=current;
			} else if(current > best)
			{
				best=current;
			
				
			}
		}
		
		System.out.println("최대값은 "+best+"입니다.");
		
		
	}

}
