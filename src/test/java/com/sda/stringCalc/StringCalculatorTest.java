package com.sda.stringCalc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();
    @Before
    public void init(){
        this.stringCalculator = new StringCalculator();
    }

    @Test
    public void testAddition(){
        //then
        Assert.assertEquals(5,stringCalculator.add("2;3"));
        Assert.assertEquals(10,stringCalculator.add("2;8"));
        Assert.assertEquals(55,stringCalculator.add("15;40"));
    }

    @Test
    public void testNull(){
        //given
        String value = null;
        //when
        int result = stringCalculator.add(value);
        //then
        Assert.assertEquals(0,result);
    }

    @Test
    public void testBlank(){
        //given
        String value = "";
        //when
        int result = stringCalculator.add(value);
        //then
        Assert.assertEquals(0,result);
    }

}
