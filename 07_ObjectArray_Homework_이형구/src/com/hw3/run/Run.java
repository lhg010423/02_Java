package com.hw3.run;

import com.hw3.controller.ProductController;

public class Run {
	public static void main(String[] args) {
		
//		ProductController pc = new ProductController();
//		pc.mainMenu();
		
		// 한번쓰는거면 이렇게 써도 됨
		new ProductController().mainMenu();
		
		
	}
}
