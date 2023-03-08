package com.springcore;

public class Trainees {
	private TrainerInterface tt;
	
	
	//adapter
	public void setTt(TrainerInterface tt) {
		this.tt = tt;
	}

	public void print() {
		tt.teach();
	}

	public static void main(String[] args) {
		TrainerInterface t1=new Trainer();
		
		Trainees ttt=new Trainees();
		ttt.setTt(t1);    //passing object of one class inside setter method is known as dependency injection
		
		ttt.print();
		
		
		

	}

}
