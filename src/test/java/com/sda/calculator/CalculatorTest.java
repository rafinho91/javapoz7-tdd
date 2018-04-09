package com.sda.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init(){
        this.calculator = new Calculator();
    }

    @Test
    public void TestAdd(){
        //when
        int sum = calculator.sum(3,5);
        //then
        Assert.assertEquals("Result is not 8",8, sum);
    }
    @Test
    public void TestSubtract(){
        //when
        int result = calculator.subtract(3,5);
        //then
        Assert.assertEquals("Result is not -2",-2, result);
    }

    @Test
    public void TestMultiply(){
        //when
        int result = calculator.multiply(3,5);
        //then
        Assert.assertEquals("Result is not 15",15, result);
    }

    @Test
    public void TestDivide(){
        //then
        Assert.assertEquals("Result is not 3",3, calculator.divide(15,5));
        Assert.assertEquals("Result is not 5",5, calculator.divide(10,2));
    }

}
