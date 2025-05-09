package com.example.demo.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreationTimestamp
    private LocalDateTime timestamp;

    private double temperature;
    private double turbidity; // Changed from Long to double
    private double pH;
    private int waterLevel;


    public Fish() {
        super();
    }
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
    public double getTurbidity() {
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