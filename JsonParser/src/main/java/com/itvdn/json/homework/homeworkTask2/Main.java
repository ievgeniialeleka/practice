package com.itvdn.json.homework.homeworkTask2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String input = "{\"country\":\"Ukraine\",\"city\":\"Kyiv\",\"street\":\"Kreschatyk\"}";
        JacksonParser2.jsonParser(input);
    }
}
