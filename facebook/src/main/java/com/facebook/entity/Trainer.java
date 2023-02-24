package com.facebook.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trainer {
	
	@Id
	private String trainer_id;
	private String trainer_name;
	
	@OneToMany(mappedBy = "train")
	private List<Trainees> traineesList;

	public String getTrainer_id() {
		return trainer_id;
	}

	public void setTrainer_id(String trainer_id) {
		this.trainer_id = trainer_id;
	}

	public String getTrainer_name() {
		return trainer_name;
	}

	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}

	public List<Trainees> getTraineesList() {
		return traineesList;
	}

	public void setTraineesList(List<Trainees> traineesList) {
		this.traineesList = traineesList;
	}
	
	
	

}
