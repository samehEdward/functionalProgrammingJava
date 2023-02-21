package com.example.functionalprogrammingjava;

import java.util.function.Function;

public class LamdaExpressions {

    public static void main(String[] args) {

        Function<Integer , Integer> absloutValue =
                (x) -> x < 0 ? x : -x;

        System.out.println(absloutValue.apply(-10));
    }

}
