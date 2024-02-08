package edu.kh.oop.practice.model.vo;

public class Book {
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	
	public Book() {
//		title = "자바의 정석";
//		price = 30000;
//		discountRate = 0.2;
//		author = "남궁성";
		
		
	}
	
	public Book(String title, int price, double discountRate, String author ) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
		
	
	}
	
	
	
	// shift + alt + s 누른후 Generate toString()...클릭
	// 그럼 자동으로 위 변수 4개가 선택되어있음
	// generate 클릭하면 아래 Override 가 자동 생성됨
	
	
	//	@Override
	//	public String toString() {
	//		return "Book [title=" + title + ", price=" + price + ", discountRate=" + discountRate + ", author=" + author
	//				+ "]";
	//	}
	
	// 위 코드에서 return 만 수정한게 아래 코드
	@Override
	public String toString() {
		return title + " / " + price + " / " + discountRate + " / " + author;
	}
	
	
	
	
	
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}








	
	
	

}
