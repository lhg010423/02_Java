package com.hw4.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.hw4.model.vo.Toy;

public class ToyFactory {
	
	Scanner sc = new Scanner(System.in);

	Map<Integer, String> ingredient;
	List<Toy> toy;

	public ToyFactory() {
		
		ingredient = new HashMap<Integer, String>();
		
		ingredient.put(1, "면직물");
		ingredient.put(2, "플라스틱");
		ingredient.put(3, "유리");
		ingredient.put(4, "고무");
		
		
		toy = new ArrayList<Toy>();
		
		toy.add( new Toy ("마미롱레그", 8, 36000, "분홍색", 19950805, (ingredient.get(1) + ", " + ingredient.get(4))) );
		toy.add( new Toy ("허기워기", 5, 12000, "파란색", 19940312, (ingredient.get(1) + ", " + ingredient.get(2))) );
		toy.add( new Toy ("키시미시", 5, 15000, "분홍색", 19940505, (ingredient.get(1) + ", " + ingredient.get(2))) );
		toy.add( new Toy ("캣냅", 8, 27000, "보라색", 19960128, (ingredient.get(1) + ", " + ingredient.get(2))) );
		toy.add( new Toy ("파피", 12, 57000, "빨간색", 19931225, (ingredient.get(1) + ", " + ingredient.get(2) + ", " + ingredient.get(4))) );
		
	}
		
		
	public void displayMenu() {
		 
		int menuNum = 0;
		
		do {
			
			System.out.println("<< 플레이타임 공장 >>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.print("선택 : ");
			menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1 : selectToy(); break;
			case 2 : addToy(); break;
			case 3 : deleteToy(); break;
			case 4 : sortToy(); break;
			case 5 : ageToy(); break;
			
			}
			
			
		} while(menuNum != 0);
		
	}
		
		
		
	/**
	 * 전체 장난감 조회하기
	 */
	public void selectToy() {
		Iterator<Toy> all = toy.iterator();
		int num = 1;
		
		System.out.println("\n<전체 장난감 목록>");
		while(all.hasNext()) {
			Toy temp = all.next();
			System.out.println(num + ". " + temp);
			num++;
		}
		System.out.println();
		
	}
	
	
	/**
	 * 새로운 장난감 만들기
	 */
	public void addToy() {
		
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		int madeymd = sc.nextInt();
		
		String madeUse = "";
		String madeUseSum = "";
		do {
			System.out.print("재료을 입력하세요 (종료하려면 'q'를 입력하세요 : ");
			madeUse = sc.next().toUpperCase();
			
			// 입력한 재료명이 등록되어있지 않을때
			if( !(ingredient.containsValue(madeUse)) && !(madeUse.equals("Q")) ) {
				System.out.println("등록되어있지 않은 재료입니다.");
		
				
			// q를 입력한하고 처음 재료명을 입력했을 때
			} else if( !(madeUse.equals("Q")) && madeUseSum.length() == 0 ) {
				madeUseSum += madeUse;

			// q를 입력안하고 재료명을 입력했을 때
			} else if(ingredient.containsValue(madeUse) && !(madeUse.equals("Q"))) {
				madeUseSum += ", " +madeUse;
				
			}

		
		} while(!(madeUse.equals("Q")));
		System.out.println("새로운 장난감이 추가되었습니다\n");
		toy.add( new Toy (name, age, price, color, madeymd, madeUseSum));
			
		
		
	}
	

	
	/**
	 * 장난감 삭제하기
	 */
	public void deleteToy() {
		
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String name = sc.next();
		
		for(int i =0; i < toy.size(); i++) {
			
			if( toy.get(i).getName().equals(name) ) { // 이름이 일치하는 경우
				toy.remove(i);
	
			}
		}
		
	}
	
	
	
	/**
	 * 장난감 제조일 순으로 조회하기
	 */
	public void sortToy() {
		// Toy Class 뒤에 implements Comparable<Toy> 쓰고
		// compareTo 오버라이딩 해야함
		Collections.sort(toy);
		
		// 1. 전체 장난감 조회하기 복붙함
		Iterator<Toy> all = toy.iterator();
		int num = 1;
		
		System.out.println("\n<제조일 순으로 장난감을 정렬>");
		while(all.hasNext()) {
			Toy temp = all.next();
			System.out.println(num + ". " + temp);
			num++;
		}
		System.out.println();
		
		
		
	}
	
	
	
	/**
	 * 연령별 사용 가능한 장난감 리스트 조회하기
	 */
	public void ageToy() {
		
		Set<Integer> age = new HashSet<Integer>();
		
		for(int x = 0; x < toy.size(); x++) {
			age.add(toy.get(x).getAge());
		}
		
		
		
		
		
		
		int age;
		
		for(int i = 0; i < toy.size(); i++) {
			age = toy.get(i).getAge();
			System.out.printf("[연령:%d세]\n", age);
			
			for(int a = 0; a < toy.size(); a++) {
				if(toy.get(i).getAge() == age) {
					System.out.printf((a+1) + ". " + toy.get(i).toString() );
				}
			
				
			}
			
			
			
		}
		
		
	}
	

	

	// 재료 추가
	// 재료 제거
	
	
}
