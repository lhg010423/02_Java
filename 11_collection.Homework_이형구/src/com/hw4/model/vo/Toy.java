package com.hw4.model.vo;

public class Toy implements Comparable<Toy> {

	private String name; // 장난감 이름
	private int age; // 사용연령
	private int price; // 가격
	private String color; // 색상
	private int madeymd; // 제조년월일
	private String madeUse; // 사용재료
	
	public Toy() {}

	public Toy(String name, int age, int price, String color, int madeymd, String madeUse) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.madeymd = madeymd;
		this.madeUse = madeUse;
	}
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMadeymd() {
		return madeymd;
	}

	public void setMadeymd(int madeymd) {
		this.madeymd = madeymd;
	}

	public String getMadeUse() {
		return madeUse;
	}

	public void setMadeUse(String madeUse) {
		this.madeUse = madeUse;
	}
	
	
	

	@Override
	public String toString() {
		return "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + " / 사용가능연령 : " + age + " / 제조년월일 : " + madeymd
				+ " / 재료 : " + madeUse;
	}

	@Override
	public int compareTo(Toy other) {

		return this.madeymd - other.madeymd;

	}
	
	
	
	
	
	
}
