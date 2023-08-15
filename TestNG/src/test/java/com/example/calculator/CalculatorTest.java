package com.example.calculator;

import com.example.Calculator;
import com.example.listeners.Reporter;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;

@Listeners(Reporter.class)
public class CalculatorTest {

    private Calculator calculator;
    private int a;
    private int b;

    @BeforeTest
    public void init() {
        calculator = new Calculator();
    }

    @BeforeClass
    public void beforeClass() {
        a = 10;
        b = 2;
    }

    @Test(groups = "regression")
    public void testGetSum() {
        int actual = calculator.getSum(10, 2);
        int expected = 12;
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "intProvider", dataProviderClass = DataProviderFactory.class)
    public void testGetDiff(int a, int b, int result) {
        int actual = calculator.getDiff(a, b);
        int expected = result;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetProduct() {
        int actual = Calculator.getProduct(a, b);
        int expected = 20;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetQuotient() {
        int actual = calculator.getQuotient(a, b);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @AfterTest
    public void afterClass() {
        calculator = null;
    }
}
