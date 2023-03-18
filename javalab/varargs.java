package javalab;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(1,2,3,4,56,74,23,67,98);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

