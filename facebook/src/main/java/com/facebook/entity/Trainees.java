package com.facebook.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trainees {
	@Id
	private String trainees_id;
	private String trainees_name;
	
	@ManyToOne
	private Trainer train;

	public String getTrainees_id() {
		return trainees_id;
	}

	public void setTrainees_id(String trainees_id) {
		this.trainees_id = trainees_id;
	}

	public String getTrainees_name() {
		return trainees_name;
	}

	public void setTrainees_name(String trainees_name) {
		this.trainees_name = trainees_name;
	}

	public Trainer getTrain() {
		return train;
	}

	public void setTrain(Trainer train) {
		this.train = train;
	}
	
	

}
