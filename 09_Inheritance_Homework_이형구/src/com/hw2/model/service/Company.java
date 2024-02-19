package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{

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
		 if (person instanceof Employee && employeeCount < employees.length) {
	           employees[employeeCount++] = (Employee) person;
	           System.out.println("직원이 추가되었습니다 - " + person.getInfo());
	      } else {
	           System.out.println("인원이 모두 충원되어 더 이상 추가 할 수 없습니다.");
	      }
		
	}

	@Override
	public void removePerson(String id) {
		 for (int i = 0; i < employeeCount; i++) {
	           if (employees[i].getId().equals(id)) {
	               System.out.println("직원이 삭제되었습니다 - " + employees[i].getInfo());
	               employees[i] = null;
	               for (int j = i; j < employeeCount - 1; j++) { 
	            	   // 삭제한 요소가 있는 i번째 인덱스부터 배열의 마지막 요소까지 순차 접근
	            	   
	                   employees[j] = employees[j + 1];
	                   // 배열 내의 모든 후속 요소를 왼쪽으로 한 칸씩 이동하여 생성된 간격을 제거
	               }
	               employees[--employeeCount] = null;
	               // 배열의 마지막 요소를 null로 설정하고 employeeCount 변수를 감소시켜 직원 수를 줄입니다.
	               return;
	           }
	       }
	       System.out.println("ID : " + id + "인 직원을 찾을 수 없습니다.");
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 직원 명단 : ");
	       for (int i = 0; i < employeeCount; i++) {
	           System.out.println(employees[i].getInfo());
	       }
	}

}
