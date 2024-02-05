package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("짝수입니다");
		} else if(num > 0 && num % 2 == 1) {
			System.out.println("홀수입니다");
		} else {
			System.out.println("양수만 입력해주세요");
		}
		
		
		
	}
	
	public void practice2() {
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double total = sum / 3;
		
		if(kor < 40 || math < 40 || eng < 40 || total < 60) {
			System.out.println("불합격입니다");
		} else {
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %.1f\n", total);
			System.out.println("축하합니다, 합격입니다!");
		}
		
	}
	
	public void practice3() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		
		if(num < 1 || num > 12) {
			System.out.printf("%d월은 잘못 입력된 달입니다.", num);
		} else {
			switch (num) {
			case 1: System.out.printf("%d월은 31일까지 있습니다.", num); break;
			case 2: System.out.printf("%d월은 28일까지 있습니다.", num); break;
			case 3: System.out.printf("%d월은 31일까지 있습니다.", num); break;
			case 4: System.out.printf("%d월은 30일까지 있습니다.", num); break;
			case 5: System.out.printf("%d월은 31일까지 있습니다.", num); break;
			case 6: System.out.printf("%d월은 30일까지 있습니다.", num); break;
			case 7: System.out.printf("%d월은 31일까지 있습니다.", num); break;
			case 8: System.out.printf("%d월은 31일까지 있습니다.", num); break;
			case 9: System.out.printf("%d월은 30일까지 있습니다.", num); break;
			case 10: System.out.printf("%d월은 31일까지 있습니다.", num); break;
			case 11: System.out.printf("%d월은 30일까지 있습니다.", num); break;
			case 12: System.out.printf("%d월은 31일까지 있습니다.", num); break;

			}
		}
			
			// 31 : 1 3 5 7 8 10 12
			// 30 : 4 6 9 11
			// 28 : 2
				
				
			
		
		
	}
	
	public void practice4() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (m * m);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi < 25) {
			System.out.println("과체중");
		} else if(bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
		
		
	}
	
	public void practice5() {
		System.out.print("중간고사 점수(20) : ");
		double first = sc.nextDouble();
		double firstValue = first * 0.2;
		
		System.out.print("기말고사 점수(30) : ");
		double last = sc.nextDouble();
		double lastValue = last * 0.3;
		
		System.out.print("과제 점수(30) : ");
		double homeWork = sc.nextDouble();
		double homeWorkValue = homeWork * 0.3;
		
		System.out.print("출석 횟수(20) : ");
		double num = sc.nextDouble();
		
		double sum = firstValue + lastValue + homeWorkValue + num;
		
		System.out.println("=============== 결과 ===============");
		System.out.printf("중간 고사 점수(20) : %.1f\n", firstValue);
		System.out.printf("기말 고사 점수(30) : %.1f\n", lastValue);
		System.out.printf("과제 점수     (30) : %.1f\n", homeWorkValue);
		System.out.printf("출석 점수     (20) : %.1f\n", num);
		System.out.printf("총점 : %.1f\n", sum);
		
		
		
		if(num < 16) {
			System.out.printf("Fail [출석 횟수 부족] (%d/20)\n", (int)num);
		} else if(sum < 70) {
			System.out.println("Fail [점수 미달]");
		} else if(sum >= 70) {
			System.out.println("PASS");
		}
		
		
	}
	
	
	
	
}
