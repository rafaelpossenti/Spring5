package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private int[] fortune = new int[]{3,4,6}; 
	
	@Override
	public String getFortune() {
		Random random = new Random();
		int nAleatorio = random.nextInt(fortune.length); 
		int value = fortune[nAleatorio];
		return "today is your  lucky day! " + value;
	}

}
