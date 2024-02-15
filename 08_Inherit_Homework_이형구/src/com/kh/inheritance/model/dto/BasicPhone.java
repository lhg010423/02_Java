package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone{
	private boolean hasPhysicalKeboard; // 물리적 키보드 유무
	
	public BasicPhone() {}

	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeboard = hasPhysicalKeboard;
	}
	
	public void checkKeyboard() {
		if(hasPhysicalKeboard) {
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
		} else {
			System.out.println("이 휴대폰은 물리적 키보드가 없습니다.");
		}
	}

	



	public boolean isHasPhysicalKeboard() {
		return hasPhysicalKeboard;
	}

	public void setHasPhysicalKeboard(boolean hasPhysicalKeboard) {
		this.hasPhysicalKeboard = hasPhysicalKeboard;
	}
	
	
}
