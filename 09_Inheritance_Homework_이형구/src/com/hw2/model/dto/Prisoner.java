package com.hw2.model.dto;

public class Prisoner extends Person{ // 수감자

	private String crime; // 죄목
	
	public Prisoner() {}
	
	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
		
	}
	
	
	
	
	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}


	
	@Override
	public String getInfo() {
		return String.format("ID : %s , 이름 : %s , 죄목 : %s", id, name, crime);
		// id와 name을 Person에서 protected로 만들어놨기 때문에 후손클래스에서 직접접근 가능
	}
	
	
}
