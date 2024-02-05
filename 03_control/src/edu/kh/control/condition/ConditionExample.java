package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 제공용 클래스
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		// if문
		// 조건식이 true 일때만 내부 코드 수행
		/*
		 * [작성법]
		 * if(조건식) {
		 * 		조건식이 true 일때 수행할 코드
		 * }
		 * */
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력
		
		
		System.out.print("정수입력 : ");
		int num1 = sc.nextInt();
		
		if ( num1 > 0 ) {
			System.out.println("양수입니다.");
		} else if ( num1 == 0 ) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
		
	}

	public void ex2() {
		
		// if - else 문
		// 조건식 결과가 true 면 if문,
		// false면 else 구문이 수행됨
		
		/*
		 * [작성법]
		 * 
		 * if(조건식) {
		 * 		조건식이 true일 때 수행될 코드
		 * } else {
		 * 		조건식이 false일 때 수행될 코드
		 * }
		 * 
		 * */
		
		// 홀짝 검사
		// 입력받은 정수값이
		// 홀수이면 "홀수입니다"출력
		// 0이면 "0입니다"
		// 짝수이면 "짝수입니다" 출력
		// else if 사용 X, 중첩 if 문 사용하기
		
		
		System.out.print("정수 입력 : ");
		
		int num2 = sc.nextInt();
		
		if (num2 == 0) {
			System.out.println("0입니다");
		} else {
			if (num2 % 2 != 0) {
				System.out.println("홀수입니다");
			} else {
				System.out.println("짝수입니다");
			}
		}
		
		
		
	}

	public void ex3() {
		// 양수, 음수, 0판별
		// if(조건식) - else if(조건식) - else
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수입니다");
		} else if (input < 0) {
			System.out.println("음수입니다");
		} else {
			System.out.println("0입니다");
		}
		
		
		
		
	}

	public void ex4() {
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 단, 겨울일때 온도가 -15도 이하 "한파 경보", -12이하 "한파 주의보"
		// 여름일때 온도가 35도 이상 "폭염 경보", 33도 이상 "폭염 주의보"
		// 1~12 사이가 아닐 땐 "해당하는 계절이 없습니다" 출력
		// 1,2,12 겨울
		// 3~5 봄
		// 6~8 여름
		// 9~11 가을
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		String season = "";
		
		
		if(month == 1 || month == 2 || month == 12) { // 겨울
			season = "겨울";
			
			System.out.print("온도 입력 : ");
			int num = sc.nextInt();
			
			if(num <= -15) {
				season += " 한파 경보";
						
			} else if(num <= -12) {
				season += " 한파 주의보";
			} 
			
			
		} else if(month >= 3 && month <= 5) {
			System.out.println("봄");
			
			
		} else if(month >= 6 && month <= 8) {
			season = "여름";
			
			System.out.print("온도입력 : ");
			int num = sc.nextInt();
			
			if(num >= 35) {
				season += " 폭염 경보";

			} else if(num >= 33) {
				season += " 폭염 주의보";
			}
			
		} else if(month >= 9 && month <= 11) {
			season = "가을";
			
			
		} else {
		season = "해당하는 계절이 없습니다";
		}
		
		System.out.println(season);
		
	}

	public void ex5() {
		System.out.print("나이 입력 : ");
		int num = sc.nextInt();
		
		if(num <= 13) {
			System.out.println("어린이입니다");
		} else if(num <= 19) {
			System.out.println("청소년입니다");
		} else {
			System.out.println("성입입니다");
		}
		
		
		
	}
	
	public void ex6() {
		System.out.print("점수 입력(0~100) : ");
		int num = sc.nextInt();
		
		String result;
		
		
		if (num < 0 || num > 100) {
			result = "잘못 입력하셨습니다";
		} else if(num >= 90) {
			result = "A";
		} else if (num >= 80) {
			result = "B";
		} else if (num >= 70) {
			result = "C";
		} else if (num >= 60) {
			result = "D";
		} else {
			result = "F";
		}
		
		System.out.println(result);
		
		
		
	}
	
	public void ex7() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		
		if(age < 0 || age > 100) {
			result = "잘못 입력 하셨습니다";
		} else {
			
			System.out.print("키 입력 : ");
			double num = sc.nextDouble();
				
			if(age < 12) {
				result = "적정 연령이 아닙니다";
			} else if(num < 140) {
				result = "적정 키가 아닙니다";
			} else {
				result = "탑승 가능";
			}
		}
		
		System.out.println(result);
	}
	
	public void ex8() {
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		double num;
		String result;

		if(age < 0 || age > 100) {
			result = "나이를 잘못 입력 하셨습니다";
			
		} else {
			System.out.print("키 입력 : ");
			num = sc.nextDouble();
			
			if(num < 0 || num > 250) {
				result = "키를 잘못 입력 하셨습니다.";
				
			} else {	
				
				if(age >= 12 && num < 140) {
					result = "나이는 적절하나, 키가 적절치 않음";
					
				} else if(age < 12 && num >= 140) {
					result = "키는 적절하나, 나이는 적절치 않음";
					
				} else if(age < 12 && num < 140) {
					result = "나이와 키 모두 적절치 않음";
					
				} else {
					result = "탑승 가능";
				}
				
			}
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
