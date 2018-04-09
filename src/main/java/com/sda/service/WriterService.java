package com.sda.service;

import org.apache.commons.lang3.StringUtils;

public class WriterService {
    public String write(String name){
        return prefix(name) + content(name) + suffix(name);
    }

    private String suffix(String name) {
        return isCapitalizeName(name) ? "!" : ".";
    }

    private String content(String name) {
        return StringUtils.isEmpty(name) ? "my Friend" : name;
    }

    private String prefix(String name) {
        return isCapitalizeName(name) ? "HELLO, " : "Hello, ";
    }

    private boolean isCapitalizeName(String name){
        return StringUtils.isNotEmpty(name) && name.toUpperCase().equals(name);
    }
}
