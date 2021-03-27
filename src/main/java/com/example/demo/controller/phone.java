package com.example.demo.controller;

import org.springframework.stereotype.Component;

@Component
public class phone {
	 private float cost;
	 private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

}
