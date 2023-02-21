package com.example.functionalprogrammingjava;

import ch.qos.logback.core.joran.util.StringToObjectConverter;

import java.util.function.BiFunction;

public class BiFunctionBasics
{
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = (x, y) -> x+y;

        System.out.println(add.apply(7,4));

        //----------------------------------------//

        TerioFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x+y+z;

        System.out.println(addThree.apply(70,30,11));
    }


}
