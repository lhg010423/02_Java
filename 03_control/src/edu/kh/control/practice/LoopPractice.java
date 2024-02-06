package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			
			for(int i = 1; i <= num; i++) {
				System.out.printf("%d ", i);
			}
		}
	}
	
	public void practice2() {
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			
			for(int i = num; i >= 1; i--) {
				System.out.printf("%d ", i);
			}
		}
	}
	
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		String str = "";
		int sum = 0;
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			
			for(int i = 1; i <= num; i++) {
				str += i;
				if(i != num ) {
					str += " + ";
				}
				sum += i;
			}
			System.out.println(str + " = " + sum);
		}
		
	}
	
	public void practice4() {
		System.out.println("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		
		System.out.println("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		if(input1 < 1 || input2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for(int i = input1; i <= input2; i++) {
				
				
				
			}
		}
			
		
		
		
	}
	
	
	
	
}
