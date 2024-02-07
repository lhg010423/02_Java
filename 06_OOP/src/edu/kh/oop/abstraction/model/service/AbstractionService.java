package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class AbstractionService {

	// ctrl + shift + o : 해당 클래스에서 import 안된거 전부 import하기
	public void ex1() {
		// 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1
		// p1 앞에 People : 사용자 정의 자료형
		// new People(); : 새로운 People 객체를 Heap 영역에 생성
		
		// ** 클래스 이름이 자료형처럼 사용된다
		// == 그래서 클래스를 "사용자 정의 자료형"이라고도 한다
		
		
		/*
		p1.name = "홍길동";
		p1.gender = '남';
		p1.pNo = "010423-1234567";
		p1.address = "서울시 중구 남대문로 120 그레이츠청계 3층 E강의장";
		p1.phone = "010-1234-123";
		p1.age = 24;
		
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender);
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
		*/
		
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("200303-1234567");
		p1.setAddress("서울시 중구 남대문로 120 그레이츠청계 3층 E강의장");
		p1.setPhone("010-1234-123");
		p1.setAge(4);
		
		System.out.println("p1의 name : " + p1.getName());
		System.out.println("p1의 gender : " + p1.getGender());
		System.out.println("p1의 pNo : " + p1.getpNo());
		System.out.println("p1의 address : " + p1.getAddress());
		System.out.println("p1의 phone : " + p1.getPhone());
		System.out.println("p1의 age : " + p1.getAge());
		p1.tax();
		p1.vote();
		System.out.println("===============================================");
		
		// 본인 객체
		People p2 = new People();
		
		p2.setName("이형구");
		p2.setGender('남');
		p2.setpNo("010423-3000000");
		p2.setAddress("인천시 미추홀구 매소홀로 340 풍림아이원");
		p2.setPhone("010-1234-1234");
		p2.setAge(24);
		
		System.out.println("p2의 name : " + p2.getName());
		System.out.println("p2의 gender : " + p2.getGender());
		System.out.println("p2의 pNo : " + p2.getpNo());
		System.out.println("p2의 address : " + p2.getAddress());
		System.out.println("p2의 phone : " + p2.getPhone());
		System.out.println("p2의 age : " + p2.getAge());
		
		
		
		
		
		
		
	}
	
}
