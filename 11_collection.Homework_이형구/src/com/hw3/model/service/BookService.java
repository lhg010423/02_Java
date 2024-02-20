package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	Scanner sc = new Scanner(System.in);
	List<Book> book = new ArrayList<Book>();
	
	public BookService() {
		book.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		book.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		book.add(new Book(3333, "역행자", "자철", 175500, "웅진지식하우스"));
		book.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		book.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
	}
	
	
	public void displayMenu() {
		
		
		int num = 0;
		
		do {
			
			System.out.println("=== 도서 목록 프로그램 ===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴를 입력하세요 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : addBook(); break;
			case 2 : selectBook(); break;
			
			
			}
			
			
			
			
			
			
			
			
		} while(num != 0);

	}
	

	public void addBook() {
		
		System.out.println("====== 도서 등록 ======");
		
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		
		System.out.print("도서 제목 : ");
		String bookName = sc.next();
		
		System.out.print("도서 저자 : ");
		String author = sc.next();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.next();
		
		System.out.println("등록 완료");
		
		book.add(new Book(bookNum, bookName, author, price, publisher));
		
	}
	
	public void selectBook() {
		
		System.out.println("\n====== 도서 조회 ======");
	
		for(Book b : book) {
			System.out.println(b.toString());	
		}
		
	}
	
	public void updateBook() {
		
		System.out.println("\n====== 도서 수정 ======");
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println("1. 도서명");
		System.out.println("2. 도서 저자");
		System.out.println("3. 도서 가격");
		System.out.println("4. 도서 출판사");
		System.out.println("0. 수정 종료");
		System.out.println("어떤 정보를 수정하시겠습니까? : ");
		num = sc.nextInt();
		
		
		switch(num) {
		case 1 : System.out.print("수정할 도서명을 입력하세요 : ");
		sc.nextLine();
		String name = sc.nextLine();
		book.set(num, null)
		
		
		}
		
	}
	
	
	
	
	
	
}
