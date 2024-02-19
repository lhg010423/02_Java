package edu.kh.exception.test;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		// 컴파일 에러 -> 개발자가 코드 잘못 쓴 경우
		// 자료형이 맞지않아 연산 불가형 "컴파일 에러"가 발생(코드 틀림)
		// int a = 99.9; // Type mismatch: cannot convert from double to int
		int a = (int)99.9; // 코드로 수정 가능
		
		// 런타임 에러 -> 프로그램 수행 중 발생하는 에러
		//			주로 if문으로 처리 가능하다
		
		int[] arr = new int[3]; // 길이 3 : 인덱스 0,1,2 까지
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
//		arr[3] = 40;
		// java.lang.ArrayIndexOutOfBoundsException : 배열 범위 초과 예외
		
		if(3 >= arr.length) { // 배열 인덱스 범위 초과 시
			System.out.println("배열 범위를 초과했습니다");
			
		} else {
			arr[3] = 40;
			arr[4] = 50;
		}
		
		// Checked Exception : 예외처리 필수
		// 객체로 말들어지면 -> 예외가 발생함
		// 자바실행 시 발생하는 예외는 모두 클래스로 작성되어있음
		
		// try(시도하다) : 예외가 발생할 것 같은 코드 수행을 시도
		// -> 수행 중 예외 발생 시, 예외 객체가 던져짐(throw)
		// catch(던진 것을 받다) : try에서 던져진 예외를 잡아서 처리
		// -> 예외 잡아서 처리했기 때문에 프로그램이 종료되지 않음
		
		
		
	}
}
