package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.service.Company;
import com.hw2.model.service.Prison;

public class Run {
	public static void main(String[] args) {
		
		Company cp = new Company(10);
		Prison ps = new Prison(10);
		
		Employee emp = new Employee();
		
		
		
		emp = new Employee("EMP001", "유재석", "기획팀");
		emp = new Employee("EMP002", "정형돈", "개발팀");
		
		System.out.println(emp.getInfo());
		
		// 전체 직원 명단
		
		
		
		
		
		
	}
}
