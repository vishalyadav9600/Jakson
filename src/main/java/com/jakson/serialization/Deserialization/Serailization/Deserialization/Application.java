package com.jakson.serialization.Deserialization.Serailization.Deserialization;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Car car1 = new Car("Audi", "Q8");
        Car car2 = new Car("BMW", "X5");
        Car car3 = new Car("Mercedes", "C-Class");

        // Serialize the car objects to JSON
        String serializedData = SerializationHelper.serializeObject(new Car[]{car1, car2, car3});
        System.out.println("Serialized JSON:\n" + serializedData);

        // Save the serialized JSON to a file
        SerializationHelper.saveToFile(serializedData, "carModels.json");

        // Read the serialized JSON from the file
        String loadedData = SerializationHelper.loadFromFile("carModels.json");

        // Deserialize the JSON back to an array of car objects
        Car[] deserializedCars = SerializationHelper.deserializeObject(loadedData, Car[].class);
        System.out.println("\nDeserialized Car Models:");
        for (Car car : deserializedCars) {
            System.out.println(car);
        }
	}

}
