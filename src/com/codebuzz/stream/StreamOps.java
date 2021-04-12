package com.codebuzz.stream;

import java.util.Arrays;
import java.util.List;



public class StreamOps {

    public static void main(String[] args) {

        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9,10);



        num.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .forEach(System.out::println);
    }
}
