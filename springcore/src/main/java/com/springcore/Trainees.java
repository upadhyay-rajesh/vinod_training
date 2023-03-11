package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
	//	TrainerInterface t1=new Trainer(); //spring will do this step automatically
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("abc.xml");
		Trainees ttt=(Trainees)ctx.getBean("vinod");
		
		//in above line BeanFactory class will create object of id vinod i.e. trainees class and will check property i.e. setter method  and will inject rajesh id i.e. will create object of Trainer and pass to trainees
		//all the object created by BeanFactory will be singleton
		//what is singleton
		//singleton is a design pattern which is used to create only one object of bean.
		//if there are 10 user like liberary,trainees,hod,college,industry etc want to use Trainer object then how many object spring BeanFactory will create
		//answer: only one object will be created by BeanFactory and will give to all user.
		//if everyuser want its own object then how BeanFactory will create multiple object of Trainer class.
		//answer: by changing scope of trainer class from singleton to prototype. inside xml
		
		//what is life cycle of bean in spring
		//init,service, destroy is life cycle
		//how to implement practically
		
	//	ttt.setTt(t1);    //passing object of one class inside setter method is known as dependency injection //spring will do this step automatically
		
		ttt.print();
		
		
		

	}

}
