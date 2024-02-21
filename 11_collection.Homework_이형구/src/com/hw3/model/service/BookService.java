package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	private Scanner sc = new Scanner(System.in);
	
	private List<Book> library = new ArrayList<Book>();
	private List<Book> favList = new ArrayList<Book>();
	
	public BookService() {
		library.add(new Book("세이노의 가르침", "세이노", 6480, "데이원", 1111));
		library.add(new Book("문과남자의 과학공부", "유시민", 15750, "돌베개", 2222));
		library.add(new Book("역행자", "자철", 175500, "웅진지식하우스", 3333));
		library.add(new Book("꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들", 4444));
		library.add(new Book("도둑맞은 집중력", "요한 하리", 16920, "어크로스", 5555));
	}
	
	
	public void displayMenu() {
		
		try {
			
		
			int menuNum = 0;
			
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
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1 : System.out.println(addBook()); break;
				case 2 : System.out.println(selectBook()); break;
				case 3 : System.out.println(editBook()); break;
				case 4 : System.out.println(deleteBook()); break;
				case 5 : System.out.println(addFavorite); break;
				case 6 : System.out.println(deleteFavorite()); break;
				case 7 : showBookList(favList); break;
				case 8 : randomBook(); break;
				case 0 : System.out.println("종료되었습니다."); break;
				default : System.out.println("잘못 입력하셨습니다.메뉴에 있는 번호를 입력해주세요"); break;
				
				}
				
			} while(menuNum != 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

	/** 도서 등록 메서드
	 * @return
	 */
	public String addBook() {
		
		System.out.println("====== 도서 등록 ======");
		
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		
		System.out.print("도서 제목 : ");
		String title = sc.next();
		
		System.out.print("도서 저자 : ");
		String writer = sc.next();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.next();
		
		Book newBook = new Book(title, writer, price, publisher, bookNum);
		
		library.add(newBook);
		
		return "등록 완료";
	}
	
	
	/** 도서 목록 조회용 메서드
	 * 
	 */
	public void showBookList(List<Book> list) {
		if(list.isEmpty() ) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요");
		} else {
			for(Book temp : list) {
				System.out.println(temp);
			}
		}
		
	}
	
	
	
	
	
	
	/** 도서 수정용 메서드
	 * @return
	 */
	public void selectBook() {
		
		showBookList(library);
		
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
