package com.hw4.controller;

import com.hw4.model.vo.Member;

public class MemberController {

	public static int SIZE = 10; // 최대 회원 수 = 10;
	
	private int memberCount; // 현재 회원 수
	private Member[] mem = new Member[SIZE]; // 회원 객체 배열
	
	
	
	public int getMemberCount() {}
	
	public Member[] getMem() {}
	
	public Member checkId(String userId) {}
	
	public void insertMember(Member m) {}
	
	public Member searchMember(int menu, String search) {}
	
	public void updateMember(Member m, int menu, String update) {}
	
	public void deleteMember(String userId) {}
	
	public Member[] sortIdAsc() {}
	
	public Member[] sortIdDesc() {}
	
	public Member[] sortAgeAsc() {}
	
	public Member[] sortAgeDesc() {}
	
	public Member[] sortGenderDesc() {}
	
	
	
	
}
