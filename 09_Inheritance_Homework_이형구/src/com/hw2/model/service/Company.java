package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements MansgementSystem{

	Person ps = new Employee();
	
	
	private Employee[] employees; // 전체 직원 저장용
	private int employeeCount; // 직원수
	

	public Company() {}
	
	public Company(int size) {
		employees = new Employee[size];
		employeeCount = 0;
	}
	
	
	
	
	@Override
	public void addPerson(Person person) {
		if(employeeCount < 10) {
			employees[employeeCount] = new ((Employee)ps).getInfo();
			employeeCount++;
		} else {
			System.out.println("인원이 모두 충원되었습니다");
		}
		
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
