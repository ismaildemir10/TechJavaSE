package com.icd.exceptions;
//kendi uyguladığımız  exception
public class BadRequest400 extends RuntimeException{
    public BadRequest400(String message) {
        super(message);
    }
}
