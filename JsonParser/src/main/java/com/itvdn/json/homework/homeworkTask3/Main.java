package com.itvdn.json.homework.homeworkTask3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String input = "{\"country\":\"Ukraine\",\"city\":\"Kyiv\",\"street\":\"Kreschatyk\"}";
        GsonParser.gsonParser(input);
    }
}
