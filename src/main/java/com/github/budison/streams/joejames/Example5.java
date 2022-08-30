package com.github.budison.streams.joejames;

import java.util.Arrays;

class Example5 {

    public static void main(String[] args) {

        // 5. Stream from Array, sort, filter and print
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names)        // same as Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }
}
