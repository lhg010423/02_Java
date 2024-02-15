package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	Scanner sc = new Scanner(System.in);
	Product[] pro = null;
	public static int count = 0;
	
	
	// 초기화 블럭
	{
		pro = new Product[10];
	}
	
	
	public void mainMenu() {
		int menu = 0;
		
		do {
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("3. 제품 정보 삭제");
			System.out.println("4. 제품 정보 수정");
			System.out.println("5. 제품 정보 검색");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menu = sc.nextInt();
			sc.nextLine();
			
			
			switch(menu) {
			case 1: productInput(); break;
			case 2: productPrint(); break;
			case 3: productDelete(); break;
			case 4: productUpdate(); break;
			case 5: productSearch(); break;
			case 0: System.out.println("프로그램 종료"); break;
			default : System.out.println("숫자를 다시 입력하시오");
			
			}
			
			
		} while(menu != 0);

		
	}
	

	// 1. 제품 정보 추가
	public void productInput() {
		
		System.out.print("제품 번호 : ");
		int pld = sc.nextInt();
		
		sc.nextLine(); // 입력버퍼에 있는 개행문자 제거
		System.out.print("제품명 : ");
		String pName = sc.nextLine();
		
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		pro[count] = new Product(pld, pName, price, tax);
		
		
	}
	
	
	// 2. 제품 전체 조회
	public void productPrint() {
		for(int i = 0; i < count; i++) {
			System.out.println(pro[i].information());
			}
	}
	
	
	// 3. 제품 정보 삭제
	public void productDelete() {
		System.out.println("\n삭제할 제품명을 입력하시오");
		
		for(int i = 0; i < count; i++) {
			System.out.println(i + "번 : " + pro[i].getpName());
		}
		
		System.out.print("번호 입력 : ");
		int input = sc.nextInt();
		pro[input] = null;
		count--;
		System.out.println("삭제가 완료되었습니다.\n");
	}
	
	
	// 4. 제품 정보 수정
	public void productUpdate() {
		System.out.println("\n수정할 제품명을 입력하시오");
		
		for(int i = 0; i < count; i++) {
			System.out.println(i + "번 : " + pro[i].getpName());
		}
		
		System.out.print("번호 입력 : ");
		int input = sc.nextInt();
		
		System.out.print("제품 번호 : ");
		int pld = sc.nextInt();
		
		sc.nextLine();
		System.out.print("제품명 : ");
		String pName = sc.nextLine();
		
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		pro[input] = new Product(pld, pName, price, tax);
		count--;
		
		System.out.println("수정된 결과");
		System.out.println(pro[input].information());
		
		
		
	}
	
	
	// 5. 제품 정보 검색
	public void productSearch() {
		System.out.println("\n검색할 제품 번호를 입력하시오");
		for(int i = 0; i < count; i++) {
			System.out.println(i + "번 : " + pro[i].getpName());
		}
		System.out.print("번호 입력 : ");
		int input = sc.nextInt();
		
		System.out.println(pro[input].information());
		
		
		
	}
	
	
}
