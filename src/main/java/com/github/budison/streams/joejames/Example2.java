package com.github.budison.streams.joejames;

import java.util.stream.IntStream;

class Example2 {

    public static void main(String[] args) {

        // Integer Stream with skip
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));   // same as .forEach(System.out::println);
        System.out.println();
    }
}
