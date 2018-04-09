package com.sda.service;

public class WriterService {
    public String write(String name){
        return prefix(name) + content(name) + suffix(name);
    }

    private String suffix(String name) {
        return isCapitalizeName(name) ? "!" : ".";
    }

    private String content(String name) {
        return name == null ? "my Friend" : name;
    }

    private String prefix(String name) {
        return isCapitalizeName(name) ? "HELLO, " : "Hello, ";
    }

    private boolean isCapitalizeName(String name){
        return name != null && name.toUpperCase().equals(name);
    }
}
