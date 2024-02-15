package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;

public class MemberMenu {

	// MemberController 클래스 접근을 위해 필드로 선언
	private MemberController mc = new MemberController();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 메뉴 출력 -> 반복 실행 처리
		int menu = 0;
				
		do {
			System.out.println("===== 회원 관리 메뉴 =====");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAllMember(); break;
			case 6 : sortMember(); break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("숫자를 다시 쓰시오.");
			
			}
	
		} while(menu != 0);
		
		
		
		
	}
	
	
	// 회원에 대한 정보를 입력 받고 동일한 아이디가 없는 경우 실행
	public void insertMember() {
		// 아이디, 비번, 이름,  나이 성별, 이메일 필요함
		
		if(mc.MemberCount >= mc.SIZE)
		
		int menu = 0;
		
		do {
			System.out.println("===== 회원 정보 검색 =====");
			System.out.println();
			
		} while(menu != 0);
		
		
		
	}
	
	public void searchMember() {}
	
	public void updateMember() {}
	
	public void deleteMember() {}
	
	public void printAllMember() {}
	
	public void sortMember() {}
	
	
	
	
	
	
	
	
	
	
	
}
