package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements MansgementSystem{

	private Prisoner[] prisoners; // 전체 수용자 저장용 배열
	private int prisonerCount; // 수용자 수
	
	public Prison() {}
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}
	
	
	
	
	
	
	public Prisoner[] getPrisoners() {
		return prisoners;
	}
	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}
	public int getPrisonerCount() {
		return prisonerCount;
	}
	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}
	
	
	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removePerson(String id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void displayAllPersons() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
