package com.itvdn.json.example.ex_001.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itvdn.json.example.ex_001.entity.Person;

import java.io.File;
import java.io.IOException;

public class JacksonDataBind {
    public static void parseJson(String path) {
        ObjectMapper objectmapper = new ObjectMapper();

        Person person = null;

        try {
            person = objectmapper.readValue(new File(path), Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(person);
        System.out.println(person.getFirstName());
    }
}
