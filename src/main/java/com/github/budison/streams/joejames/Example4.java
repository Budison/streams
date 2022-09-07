package com.github.budison.streams.joejames;

import java.util.stream.Stream;

class Example4 {

    public static void main(String[] args) {

        // Stream.of, sorted and findFirst
        Stream.of("Ava", "Antony", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // Now with empty stream - still compiles
        Stream.of()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
