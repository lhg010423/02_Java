package com.hw4.model.vo;

import java.util.Objects;
import java.util.Set;

public class Toy{

	private String name; // 장난감 이름
	private int age; // 사용연령
	private int price; // 가격
	private String color; // 색상
	private String manufactureDate;; // 제조일(문자열로 표현)
	private Set<String> materials; // 재료 (중복되지 않는 값으로 저장

	
	public Toy() {}



	public Toy(String name, int age, int price, String color, String manufactureDate, Set<String> materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manufactureDate = manufactureDate;
		this.materials = materials;
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



	public String getManufactureDate() {
		return manufactureDate;
	}



	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}



	public Set<String> getMaterials() {
		return materials;
	}



	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}


	// materials 안에 있는 모든 재료를 문자열 형태로 만들어 반환하는 메서드
	public String getMaterialsAsString() {
		StringBuilder sb = new StringBuilder();
		
		for(String material : materials) {
			sb.append(material).append(", ");
		}
		
		// 마지막 쉼표와 공백 제거하기
		if(sb.length() > 0) {
			sb.setLength(sb.length() -2);
		}
		return sb.toString();
		
	}
	
	
	

	@Override
	public String toString() {
		return String.format("이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d / 제조년월일 : %s / 재료 : %s", 
				name, price, color, age, manufactureDate, getMaterialsAsString());
	}


	// 장난감은 중복저장이안되서 hashSet을 씀 hash를 쓰려면 hashCode(), equals() 가 오버라이딩 되어있어야 한다
	// shift + alt + s -> Generate hashCode() and equals()...
	@Override
	public int hashCode() {
		return Objects.hash(age, color, manufactureDate, materials, name, price);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color)
				&& Objects.equals(manufactureDate, other.manufactureDate) && Objects.equals(materials, other.materials)
				&& Objects.equals(name, other.name) && price == other.price;
	}

	
	
	
	
	
	
}
