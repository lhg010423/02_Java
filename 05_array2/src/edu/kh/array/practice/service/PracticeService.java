package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1() {
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.printf("\n짝수 번째 인덱스 합 : %d", sum);
	}
	
	public void practice2() {
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = (arr.length)-1; i >= 0; i--) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			if(i % 2 != 0 && i != 0) {
				sum += arr[i];
			}
		}
		System.out.printf("\n홀수 번째 인덱스 합 : %d", sum);
		
		
	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		for(int i = 1; i <= input; i++) {
			arr[i-1] = i;
			System.out.print(arr[i-1] + " ");
		}

	}
	
	public void practice4() {
		
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("입력 %d : ", i);
			int num = sc.nextInt();
			arr[i] = num;
//			System.out.println();
		}
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = false;
		
		for(int i = 0; i < 5; i++) {
			if(arr[i] == search) {
				System.out.printf("인덱스 : %d", i);
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	

		
		
	}
	
	public void practice5() {
		System.out.print("문자열 : ");
		String input = sc.next();
		char[] arr = new char[input.length()];
		
		
		for(int i = 0; i < input.length(); i++) {
			arr[i] += input.charAt(i);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
