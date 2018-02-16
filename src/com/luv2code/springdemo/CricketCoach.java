package com.luv2code.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("inside no-arg");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside set method");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes a day";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
