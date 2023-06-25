package com.jakson.serialization.Deserialization.Serailization.Deserialization;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationHelper {
	public static String serializeObject(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T deserializeObject(String data, Class<T> valueType) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(data, valueType);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void saveToFile(String data, String fileName) {
        try {
            Path filePath = Paths.get(fileName);
            Files.writeString(filePath, data);
            System.out.println("Serialized data saved to file: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String loadFromFile(String fileName) {
        try {
            Path filePath = Paths.get(fileName);
            return Files.readString(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
