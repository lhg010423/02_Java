package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {

	Snack s = new Snack();
	public void saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		System.out.println("저장 완료되었습니다.");
		return ;
	}
	
	public void confirmData()	{
		s.getKind();
		s.getName();
		s.getFlavor();
		s.getNumOf();
		s.getPrice();
	}
}
