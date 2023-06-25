package com.jakson.serialization.Deserialization.Serailization.Deserialization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
        // Create a Car object
        Car car = new Car("AUDI", "Q8");

        // Serialize the Car object to JSON
        String serializedData = SerializationHelper.serializeObject(car);
        System.out.println("Serialized JSON:\n" + serializedData);

        // Save the serialized JSON to a file
        SerializationHelper.saveToFile(serializedData, "car.json");

        // Read the serialized JSON from the file
        String loadedData = SerializationHelper.loadFromFile("car.json");

        // Deserialize the JSON back to a Car object
        Car deserializedCar = SerializationHelper.deserializeObject(loadedData, Car.class);
        System.out.println("\nDeserialized Car:\n" + deserializedCar);

	}

}
