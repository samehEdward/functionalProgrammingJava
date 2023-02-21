package com.example.functionalprogrammingjava;

import java.util.function.Function;

public class FirstU {

    protected static class MyMath {
        public static Integer triple(Integer x)
        {
            return x * 3;
        }
    }



    public static void main(String[] args) {

        Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(5);
        System.out.println(result);


        Function<Integer, Integer> myTripo = Mymath2::tripo;
        Integer resulto = myTripo.apply(3);
        System.out.println(resulto);
    }
}
