package com.sda.stringCalc;

public class StringCalculator {

    public int add(String numbers){
        String[] split = numbers.split(";");
        return Integer.valueOf(split[0]) + Integer.valueOf(split[1]);
    }

}
