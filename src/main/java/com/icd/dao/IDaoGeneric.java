package com.icd.dao;

import lombok.ToString;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDaoGeneric<T> {
    public T create(T t);
    public ArrayList<T> list();
    public T findById(T t);
    public T update(T t);
    public T delete(T t);
    //default public Connection getInterfaceConnection(){}


}
