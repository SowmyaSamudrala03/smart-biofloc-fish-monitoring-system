package com.example.demo.Entity;

import java.time.LocalDateTime;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Data
@Entity
public class Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @CreationTimestamp
    private LocalDateTime timestamp;
    //	private Timestamp time;
    private double temperature;
    private Long turbidity;
    private double pH;
    private int waterLevel;

    public Fish() {
        super();
        // TODO Auto-generated constructor stub
    }
//	public Fish(Long id, Timestamp time, double temperature, Long turbidity, double pH, int waterLevel) {
//		super();
//		this.id = id;
//		this.time = time;
//		this.temperature = temperature;
//		this.turbidity = turbidity;
//		this.pH = pH;
//		this.waterLevel = waterLevel;
//	}


    //	public Fish(Long id, double temperature, Long turbidity, double pH, int waterLevel) {
//	super();
//	this.id = id;
//	this.temperature = temperature;
//	this.turbidity = turbidity;
//	this.pH = pH;
//	this.waterLevel = waterLevel;
//}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Long getTurbidity() {
        return turbidity;
    }

    public void setTurbidity(Long turbidity) {
        this.turbidity = turbidity;
    }

    public double getpH() {
        return pH;
    }

    public void setpH(double pH) {
        this.pH = pH;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }
}
