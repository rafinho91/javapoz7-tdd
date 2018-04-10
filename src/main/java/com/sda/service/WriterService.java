package com.sda.service;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WriterService {
    public String write(String name){
        return prefix(name) + content(name) + suffix(name);
    }

    private String suffix(String name) {
        return isCapitalizeName(name) ? "!" : ".";
    }

    private String content(String name) {
        if (StringUtils.isBlank(name)){
            return "my Friend";
        }
        StringBuilder builder = new StringBuilder();
        String[] names = name.split(",");
        for (int i = 0; i < names.length-1; i++) {
            builder.append(names[i])
                    .append(getDelimiter(i, names, name));
        }
        return builder.append(names[names.length-1]).toString();

    }

    private String prefix(String name) {
        return isCapitalizeName(name) ? "HELLO, " : "Hello, ";
    }

    private boolean isCapitalizeName(String name){
        return StringUtils.isNotBlank(name) && name.toUpperCase().equals(name);
    }

    private String getDelimiter(int index, String[] names, String name){
        return index != names.length-2 ? ", " : (
                isCapitalizeName(name) ? " AND " : " and ");
    }
}
