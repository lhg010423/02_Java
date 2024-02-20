package com.hw3.model.dto;

public class Book {

	private int bookNum; // 도서번호
	private String bookName; // 도서명
	private String author; // 작가
	private int price; // 가격
	private String publisher; // 출판사
	
	public Book() {}

	public Book(int bookNum, String bookName, String author, int price, String publisher) {

		this.bookNum = bookNum;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return bookNum + "번 도서 : [도서제목 : " + bookName + " / 도서저자 : " + author + 
				" / 도서가격 : " + price + " / 출판사 : " + publisher + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
