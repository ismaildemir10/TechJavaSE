package com.icd.exceptions;
//kendi uyguladığımız  exception
public class IcdException extends RuntimeException{
    public IcdException(String message) {
        super(message);
    }
}
