package com.sda.stringCalc;

import org.apache.commons.lang3.StringUtils;

public class StringCalculator {

    public int add(String numbers){
        if (StringUtils.isBlank(numbers)) {
            return 0;
        }
        int result = 0;
        String[] split = numbers.split(";");
        for (String element : split) {
            result += Integer.valueOf(StringUtils.deleteWhitespace(element));
        }
        return result;
    }

}
