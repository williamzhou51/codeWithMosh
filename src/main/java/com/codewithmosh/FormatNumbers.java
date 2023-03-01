package com.codewithmosh;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class FormatNumbers {

    public static void main(String[] args) {
        NumberFormat percent = NumberFormat.getPercentInstance();
        String res = percent.format(0.11);
        System.out.println(res);
    }
}

