package com.jakson.serialization.Deserialization.Serailization.Deserialization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class  Car {
    @JsonProperty(value = "make")
    private String make;

    @JsonProperty(value = "model")
    private String model;

    public Car() {
        // Default constructor required for Jackson deserialization
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
    
}
