package com.hw2.model.dto;

public class Employee extends Person{

	private String position; // 직책
	
	
	public Employee() {}
	
	public Employee(String id, String name, String position) {
		this.id = id;
		this.name = name;
		this.position = position;
	}
	
	
	
	
	
	
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}








	@Override
	public String getInfo() {
		String str = "ID : " + id +
				" , 이름 : " + name + " , 직책 : " + position;
		
		return str;
	}
	

	
	
}
