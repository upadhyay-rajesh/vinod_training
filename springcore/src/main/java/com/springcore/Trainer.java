package com.springcore;

public class Trainer implements TrainerInterface{
	public void teach() {
		System.out.println("trainer is teaching");
	}
	
	public void rajeshInit() {
		System.out.println("trainer initialized");
	}
	
	public void rajeshDestroy() {
		System.out.println("trainer destroyed");
	}
}
