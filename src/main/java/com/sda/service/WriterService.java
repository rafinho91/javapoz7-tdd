package com.sda.service;

public class WriterService {
    public String write(String name){
        String nameToDisplay = name == null ? "my Friend" : name;
        return "Hello, " + nameToDisplay + "!";
    }
}
