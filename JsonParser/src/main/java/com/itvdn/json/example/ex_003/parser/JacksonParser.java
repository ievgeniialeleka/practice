package com.itvdn.json.example.ex_003.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itvdn.json.example.ex_003.entity.CurrencyRate;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JacksonParser {
    public static void parseJson(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        CurrencyRate[] currencyRates = objectMapper.readValue(new URL(url), CurrencyRate[].class);

        for (CurrencyRate tmp : currencyRates) {
            System.out.println(tmp);
        }

        String jsonString = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(currencyRates);

        Files.write(Paths.get("C:\\Users\\ievge\\Repositories\\practice\\JsonParser\\src\\main\\resources\\jsonCurrency.json"),
                jsonString.getBytes(),
                StandardOpenOption.CREATE);

    }
}

