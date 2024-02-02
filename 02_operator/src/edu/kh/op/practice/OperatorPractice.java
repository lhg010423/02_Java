package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		/*
			메소드 명 : public void practice1(){}
			모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
			1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
			
			[실행화면]
			인원 수 : 29
			사탕 개수 : 100
			1인당 사탕 개수 : 3
			남는 사탕 개수 : 13 
		 */
		
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		int a = num2 / num1;
		int b = num2 % num1;
		
		System.out.printf("1인당 사탕 개수 : %d\n", a);
		System.out.printf("남는 사탕 개수 : %d\n", b);
		
		
	}

	
	public void practice2() {
		/*
		메소드 명 : public void practice2(){}
		키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		
		ex.
		이름 : 홍길동
		학년(정수만) : 3
		반(정수만) : 4
		번호(정수만) : 15
		성별(남학생/여학생) : 남학생
		성적(소수점 아래 둘째 자리까지) : 85.75
		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		*/
		
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int h = sc.nextInt();
		
		System.out.print("반 : ");
		int b = sc.nextInt();
		
		System.out.print("번호 : ");
		int num = sc.nextInt();
		
		System.out.print("성별 : ");
		String g = sc.next();
		
		System.out.print("성적 : ");
		double j = sc.nextDouble();
		
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", h, b, num, name, g, j);
		
	}
	
	
	public void practice3() {
		/*
		메소드 명 : public void practice3(){}
		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일때 합격
		아니면 불합격을 출력해라
		
		[실행화면]
		국어 : 60
		영어 : 80
		수학 : 40
		합계 : 180
		평균 : 60.0
		 */
		
		
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		double total = sum / 3.0;
		
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", total);
		
		boolean result = (num1 >= 40) && (num2 >= 40) && (num3 >= 40) && (total >= 60);
		
		System.out.println( result ? "합격" : "불합격" );
		
	}
	
	
	
}
