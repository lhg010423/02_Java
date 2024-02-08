package edu.kh.oop.abstraction.model.vo;

public class Hero {
	
	// 속성
	// 필드 == 멤버 변수
	private String nickName;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private int exp;
	
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
	public void attack(int exp) {
		System.out.println(nickName + "(" + job + ")" + "은/는 공격을 했다!");
		System.out.println("경험치 " + exp + " 획득");
		this.exp += exp;
		if(this.exp >= 500) {
			this.exp -= 500;
			level += 1;
			System.out.println("레벨업");
			System.out.println(nickName + "(" + job + ")" + "의 레벨 : " + level);
		}
		System.out.println("현재 경험치 " + this.exp + "/500\n");
		
	}
	
	public void magicJump() {
		if(mp > 0) {
			System.out.println(nickName + "(" + job + ")" + "의 점프!\n");
			mp -= 10;			
		} else {
			System.out.println("더 이상 매직 점프할 수 없어요!\n");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
