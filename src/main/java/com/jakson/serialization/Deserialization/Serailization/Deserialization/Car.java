package com.jakson.serialization.Deserialization.Serailization.Deserialization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class  Car {
	@JsonProperty(value = "make")
    private String make;

    @JsonProperty(value = "model")
    private String model;

    // Add a default constructor
    public Car() {
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
    
}
