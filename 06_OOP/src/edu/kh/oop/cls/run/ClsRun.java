package edu.kh.oop.cls.run;

import edu.kh.oop.cls.model.service.ClsService;

public class ClsRun {
	
	public static void main(String[] args) {
		
		ClsService service = new ClsService();
		// 매개변수 없는 생성자 -> 기본생성자라고 한다
		// ClsService의 기본생성자가 작성되어있지 않지만
		// 문제없이 사용가능하다
		// 왜?
		// 컴파일러가 코드를 번역할때
		// 클래스 내부에 생성자가 하나도 없다면
		// 자동으로 기본생성자를 추가해줌(우리 눈엔 안보임)
		
		/*
		heap : 동적, new 생성자로 생성됬을때 사용하다가
				사용을 안하면 garbage collection이 없앰
		static : 정적, 프로그램 시작하고 끝날때까지 있음
		
		*/

//		service.ex1();
//		service.ex2();
//		service.ex3();
		service.ex4();
		
	}
}
