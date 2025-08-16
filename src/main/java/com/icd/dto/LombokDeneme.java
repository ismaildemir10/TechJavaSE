package com.icd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor//PARAMETRELİ constructor
@NoArgsConstructor//parametresisiz constructor
public class LombokDeneme {
    private String data;/*

    public Sss(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
*/
    public static void main(String[] args) {
        LombokDeneme s = new LombokDeneme();
        s.setData("data 15");
        System.out.println(s);
    }
}
