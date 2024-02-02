package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice3 {

	public void ex2() {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double num1 = sc.nextDouble();
		
		System.out.print("영어 : ");
		double num2 = sc.nextDouble();
		
		System.out.print("수학 : ");
		double num3 = sc.nextDouble();
		
		int total = (int)(num1 + num2 + num3);
		int p = (int)(total / 3);
		
		System.out.printf("총점 : %d, 평균 : %d", total, p);
		
		
		
	}


	public void ex3() {
		// sc.next() 와 sc.nextLine()의 차이
		
		
		// next() : 띄어쓰기 입력 불가, 띄어쓰기를 구분인자로 생각하여 가각저장
		// nextLine() : 문자열에 띄어쓰기 가능, 줄구분까지 저장
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 1 : ");
		String input1 = sc.nextLine();
		
		System.out.print("문자열 입력 2 : ");
		String input2 = sc.next();
				
		System.out.println(input1);
		System.out.println(input2);
		
		
		
	}


	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input1 = sc.nextInt();
		System.out.println(input1);
		
		sc.nextLine();// 입력버퍼에 남은 개행문자(\n) 제거
		
		System.out.print("문자열 입력 : ");
		String input2 = sc.nextLine();
		System.out.println(input2);
		
		// input1 에 1을입력하면 1\n 이 입력버퍼에 입력된다
		// 출력할시 출력버퍼에서 \n 이 사라지고 1만 출력된다
		// nextInt(), next()를 사용한뒤에 nextLine()을 사용하면
		// 전에 입력버퍼에 남아있던 개행문자(\n) 가 밀려나와
		// 자동입력되어 nextLine()에 입력이 안되는 문제가 생긴다
		// 그래서 위 코드처럼 nextLine() 사용전에 한번더 써야한다
		
		
		
		
		
	}
}



