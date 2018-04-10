package com.sda.stringCalc;

import org.apache.commons.lang3.StringUtils;

public class StringCalculator {

    public int add(String numbers){
        if (StringUtils.isBlank(numbers)) {
            return 0;
        }
        String[] split = numbers.split(";");
        return Integer.valueOf(split[0]) + Integer.valueOf(split[1]);
    }

}
