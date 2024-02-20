package com.hw2.run;

import java.util.ArrayList;
import java.util.List;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		zoo.addAnimal(new Tiger("호랑이")); // 업캐스팅
		zoo.addAnimal(new Monkey("원숭이")); // 업캐스팅
		
		
		zoo.displayMenu();
		
		
		
		
		
		
		
	}
}
