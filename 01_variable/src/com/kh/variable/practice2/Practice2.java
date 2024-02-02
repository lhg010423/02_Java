package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice2 {

	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자하나를 입력하시오 : ");
		
		char str1 = sc.next().charAt(0);
		
		
		
		System.out.printf("%c unicode : %d\n", str1, (int)str1);
	}
}
