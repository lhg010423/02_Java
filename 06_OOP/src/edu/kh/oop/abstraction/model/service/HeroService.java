package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.Hero;

public class HeroService { // 기능제공용 클래스
		
	public void ex1() {
		
		Hero h1 = new Hero();
		
		h1.setNickName("가렌");
		h1.setJob("전사");
		h1.setHp(100);
		h1.setMp(50);
		h1.setLevel(0);
		h1.setExp(0);
		System.out.printf("%s 직업으로 '%s' 님이 생성되었습니다. 현재 레벨 : %d \n",
					h1.getJob(), h1.getNickName(), h1.getLevel());
		
		
		h1.attack(50);
		h1.magicJump();
		h1.magicJump();
		h1.magicJump();
		h1.magicJump();
		h1.magicJump();
		h1.magicJump();
		
		h1.attack(600);
		
		
	}
		
		
	
	
	
}
