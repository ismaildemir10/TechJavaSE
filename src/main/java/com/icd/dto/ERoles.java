package com.icd.dto;

public enum ERoles {
    ADMIN(1,"admin"),WRITER(2,"writer"),USER(3,"user");
    //key
    private final Integer key;
    //Value
    private final String value;
    //constructor

    private ERoles(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
    //getter

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
