package com.codewithmosh;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Stack;

public class StringToArray {

    public static void main(String[] args) {


        String path = "/demo/../demos";
        Stack<Character> stack = new Stack();
        for(char c: path.toCharArray()){
            stack.push(c);
        }
        Object[] arr = stack.toArray();

        System.out.println(stack);


    }
}
