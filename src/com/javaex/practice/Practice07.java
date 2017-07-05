package com.javaex.practice;
import java.util.*;

public class Practice07 {
	public static void main(String[] args) {
		
		System.out.println("===================");
		System.out.println("  [숫자맞추기게임 시작]  ");
		System.out.println("===================");
		int ran=(int)(Math.random()*100+1);
		Scanner sc=new Scanner(System.in);
		int num;
		Scanner rc=new Scanner(System.in);
		String name;
		while(true) {
			num=sc.nextInt();
			if(num==ran) {
				System.out.println("맞았습니다.");
				System.out.println("게임을 종료하시겠습니까?(y/n) >>");
				name= rc.next();
				System.out.println(name);
				if(name=="y" || name=="Y") {
					break;
				} else {
					System.out.println("ran");
					ran=(int)(Math.random()*100+1);
				}
			} else if(num>ran) {
				System.out.println("더 낮게");
			} else if(num<ran) {
				System.out.println("더 높게");
			}
		}
		System.out.println("===================");
		System.out.println("  [숫자맞추기게임 종료]  ");
		System.out.println("===================");
	}

}
