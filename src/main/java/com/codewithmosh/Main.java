package com.codewithmosh;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        byte myAge = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter ='A';
        boolean isEligible = false;
        // Primitive

        byte age = 30;
        Date now = new Date();
        //now.getTime();

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(x);
        System.out.println(y);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = new String("Hello World" + "!!!!");
        System.out.println(message);
        String message1 = new String("Hello \"Mosh\"");
        System.out.println(message1);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));

        final float PI = 3.14F;

    }
}