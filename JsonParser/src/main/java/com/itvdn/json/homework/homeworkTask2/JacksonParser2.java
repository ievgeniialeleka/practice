package com.itvdn.json.homework.homeworkTask2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JacksonParser2 {

    public static void jsonParser(String input) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        GeoInfo geoInfo = objectMapper.readValue(input, GeoInfo.class);

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(geoInfo);

        Files.write(Paths.get("C:\\Users\\ievge\\Repositories\\practice\\JsonParser\\src\\main\\resources\\jsonGeoInfo.json"),
                jsonString.getBytes(),
                StandardOpenOption.CREATE);
    }
}
