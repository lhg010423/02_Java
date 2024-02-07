package edu.kh.oop.basic;

import java.util.Scanner;

public class AcountRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		Account ac = new Account();
		
		ac.setName("홍길동");
		ac.setAccountNumber("1234-56-7890");
		ac.setBalance(100000);
		ac.setPassword("1234");
		
		System.out.println( ac.getName() );
		System.out.println( ac.getAccountNumber() );
		System.out.println( ac.getBalance() );
		System.out.println( ac.getPassword() );
		
		ac.deposit(500000);
		ac.withdraw("1234", 2000);
		ac.withdraw("2468", 2000);
		ac.withdraw("1234", 2000000000);
		ac.withdraw("1234", 1000);
		
		
		
		System.out.println("==================================");
		Account a2 = new Account();
		
		a2.setName("이형구");
		a2.setAccountNumber("1111-11-1111");
		a2.setBalance(1000);
		
	}
	
}
