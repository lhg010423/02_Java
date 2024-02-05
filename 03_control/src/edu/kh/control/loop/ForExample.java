package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample { // 기능 제공용 클래스

	Scanner sc = new Scanner(System.in);
	
	/* for 문
	 * - 끝이 정해져 있는 (횟수가 지정되어 있는) 반복문
	 * 
	 * [작성법]
	 * 
	 * for(초기식; 조건식; 증감식) {
	 * 		조건식이 true 라면 반복 수행할 코드
	 * }
	 * 
	 * - 초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 * - 조건식 : for문의 반복 여부를 지정하는 식
	 * 			보통 초기식의 사용된 변수를 이용하여 조건식을 작성함
	 * 
	 * - 증감식 : 초기식에 사용된 변수를
	 * 			for문이 끝날 때 마다 증가 또는 감소시켜
	 * 			조건식의 결과를 변하게 하는 식
	 * 
	 * */

	public void ex1() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
	}
	
	public void ex2() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		System.out.print("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
	}
	
	public void ex3() {
		// 영어 알파벳 A 부터 Z까지 한줄로 출력
		// 셋다 결과 같음
		
		
//		for(int i = 65; i < 91; i++) {
//			System.out.printf("%c", (char)i);
//		}
		
//		for(int i = 'A'; i <= 'Z'; i++) {
//			System.out.print((char)i);
//		}
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		
	}
	
	public void ex4() {
		// 정수 5개를 입력 받아서 합계 구하기
		// ex)
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50
		// 합계 : 150

		
		int sum = 0;
		for(int i = 1; i <=5; i++ ) {
			System.out.printf("입력 %d : ", i);
			int num = sc.nextInt();
			sum += num;
		}
		System.out.printf("합계 : %d", sum);
		
		
	}
	
	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 양쪽에 () 표시
		
		// ex)
		// 괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) 7 8 ... 20
		
		System.out.print("괄호를 표시할 배수 : ");
		int num = sc.nextInt();
		for(int i = 1; i <= 20; i++) {
			if(i % num == 0) {
				System.out.printf("(%d) ", i);
			}
			System.out.printf("%d ", i);
		}		
	}
	
	public void ex6() {
		// [구구단 출력]
		// 2 ~ 9 사이 수를 하나 입력받아
		// 해당 단을 출력
		// 단, 입력받은 수가 2~9 사이 숫자가 아니면
		// "잘못 입력하셨습니다" 출력
		// 
		/* 단 입력 : 5
		 * 5 X 1 = 5
		 * 
		 * */
		
		System.out.print("단 입력 : ");
		int num = sc.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.println("잘못 입력하셨습니다");
		} else {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", num, i, num * i);
			}
		}
	}
	
	public void ex7() {
		// 구구단 모두 출력하기
		
		
		for(int y = 2; y <= 9; y++) {
			for(int x = 1; x <= 9; x++) {
				System.out.printf("%d X %d = %d\t", y, x, y * x);
			}
			System.out.println();
		}
		
		System.out.println("역순출력=======================================");
		for(int y = 9; y >= 2; y--) {
			for(int x = 1; x <= 9; x++) {
				System.out.printf("%d X %d = %d\t", y, x, y * x);
			}
			System.out.println();
		}
		
	}
	
	public void ex8() {
		// 숫자 세기 count
		// 1부터 20까지 1씩 증가하면서
		// 입력받은 수의 배수의 총 개수 출력
		// 입력받은 수의 배수의 합계 출력
		
		// 배수 입력 : 3
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		
		System.out.print("배수 입력 : ");
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;
		String result = "";
		for(int i = 1; i <= 20; i++) {
			if(i % num == 0) {
				result += i + " ";
				count++;
				sum += i;
			}
		}
		System.out.printf("%s: %d개\n", result, count);
		System.out.printf("%d의 배수 합계 : %d", num, sum);
		
		
	}
	
	
	
	
	
	
	
	
	
}
