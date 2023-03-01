package com.codewithmosh;

public class CastingTypeConversion {

    public static void main(String[] args) {
        //implicit casting
        // byte > short > int > long > float > double
        short x=1;
        int y = x+2;
        System.out.println(y);

        //explict casting
        double a = 1.1;
        int b = (int)a + 2; //2.0
        System.out.println(b);

        String m = "1";
        int n = Integer.parseInt(m) + 2; //2.0
        System.out.println(n);



    }
}
