package com.github.budison.streams.joejames;

import java.util.Arrays;
import java.util.List;

class Example7 {

    public static void main(String[] args) {

        // Stream from List, filter and print
        List<String> people = Arrays.asList(
                "Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika", "Sarah"
        );

        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
    }
}
