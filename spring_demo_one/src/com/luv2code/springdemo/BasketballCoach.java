package com.luv2code.springdemo;

public class BasketballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
		
	// define a constructor for dependency injection
	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Shoot 10000 free throw and 1000 3 pointers!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
