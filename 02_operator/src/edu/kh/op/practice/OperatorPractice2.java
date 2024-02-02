package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		System.out.print("당신의 나이는? : ");
		int age = sc.nextInt();
		
		String personType = (age >= 20) ? "성인" : "미성년";
		System.out.println("저는 " + personType + "입니다.");
		
		boolean a = (age >= 13 && age <= 19) ? true : false;
		System.out.println("청소년입니까? " + a);
		
		boolean b = (age >= 65 || age <= 12) ? true : false;
		System.out.println("노인이거나 어린이입니까? " + b);
		
		
	}
	
}
