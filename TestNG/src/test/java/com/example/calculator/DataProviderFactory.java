package com.example.calculator;

import org.testng.annotations.DataProvider;

public class DataProviderFactory {
    @DataProvider(name = "intProvider")
    public static Object[][] createData() {
        return new Object[][] {
                new Object[]{14,7,7},
                new Object[]{23,4,19},
                new Object[]{45,12,33}
        };
    }
}
