package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fish {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String FishName;
	private double temp;
	private double pH;
	private Long turbidity;
	private int waterLevel;
	public Fish(Long id, String fishName, double temp, double pH, Long turbidity, int waterLevel) {
		super();
		this.id = id;
		FishName = fishName;
		this.temp = temp;
		this.pH = pH;
		this.turbidity = turbidity;
		this.waterLevel = waterLevel;
	}
	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFishName() {
		return FishName;
	}
	public void setFishName(String fishName) {
		FishName = fishName;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getpH() {
		return pH;
	}
	public void setpH(double pH) {
		this.pH = pH;
	}
	public Long getTurbidity() {
		return turbidity;
	}
	public void setTurbidity(Long turbidity) {
		this.turbidity = turbidity;
	}
	public int getWaterLevel() {
		return waterLevel;
	}
	public void setWaterLevel(int waterLevel) {
		this.waterLevel = waterLevel;
	}
	
	
}
