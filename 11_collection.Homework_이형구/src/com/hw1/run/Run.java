package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		
		List<Friend> friends = new ArrayList<Friend>();
		
		
		// 3가지 방법이 있음
		friends.add(new Friend("짱구"));
		friends.add(new Friend("철수"));
		friends.add(new Friend("유리"));
		friends.add(new Friend("훈이"));
		friends.add(new Friend("맹구"));
		
		
		
		// Collections.addAll();
		/*
		Collections.addAll(friends, new Friend("짱구"), new Friend("철수"), 
				new Friend("유리"), new Friend("훈이"), new Friend("맹구"));
		*/
		
		
		// List.of() : Java 9 이상의 버전에서 사용 가능
		/*
		List<Friend> friends = List.of(new Friend("짱구"), new Friend("철수"), 
				new Friend("유리"), new Friend("훈이"), new Friend("맹구"));
		*/
		
		// 랜덤으로 골목대장 뽑기
		// not ! Random = new Random();
		
		int rd = (int)(Math.random() * friends.size());
		
		Friend leader = friends.get(rd);
		
		leader.pickLeader();

		
		
		
		
	}
}
