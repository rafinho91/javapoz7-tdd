package com.sda.service;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class StringCalculator {

    public int add(String numbers){
        String textWithoutWhitespaces = StringUtils.deleteWhitespace(numbers);
        String[] elements = StringUtils.split(textWithoutWhitespaces,";");
        elements = elements == null ? new String [0] : elements;
        return Arrays.stream(elements)
                .mapToInt(e -> Integer.valueOf(e))
                .sum();
    }

}
