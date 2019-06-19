package com.luv2code.springdemo;

public class HockeyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public HockeyCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
			}

	@Override
	public String getDailyWorkout() {
		return "Pucks Deep, Ducks Fly Together";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();	}

}
