package com.itvdn.json.homework.homeworkAdd.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itvdn.json.homework.homeworkAdd.entity.Currency;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JacksonParser {

    public static void parseJson(String url) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        Currency[] currencies = objectMapper.readValue(new URL(url), Currency[].class);

        for(Currency tmp : currencies) {
            if(tmp.getId().equals("36") || tmp.getId().equals("124") || tmp.getId().equals("978"))
                System.out.println(tmp);
        }

        String jsonString = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(currencies);

        Files.write(Paths.get("C:\\Users\\ievge\\Repositories\\practice\\JsonParser\\src\\main\\resources\\jsonNbuCurrency.json"),
                jsonString.getBytes(),
                StandardOpenOption.CREATE);
    }
}
