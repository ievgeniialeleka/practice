package com.itvdn.json.homework.homeworkTask3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.CharArrayReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GsonParser {

    public static void gsonParser(String input) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();

        Gson gson = new Gson();

        JsonReader jsonReader = new JsonReader(new CharArrayReader(input.toCharArray()));

        GeoInfoGson geoInfoGson = gson.fromJson(jsonReader, GeoInfoGson.class);

        String gsonString = gson.toJson(geoInfoGson);

        Files.write(Paths.get("C:\\Users\\ievge\\Repositories\\practice\\JsonParser\\src\\main\\resources\\gsonGeoInfo.json"),
                gsonString.getBytes(),
                StandardOpenOption.CREATE);

    }
}
