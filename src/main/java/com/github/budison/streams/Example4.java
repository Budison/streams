package com.github.budison.streams;

import java.util.stream.Stream;

class Example4 {

    public static void main(String[] args) {

        // 4. Stream.of, sorted and findFirst
        Stream.of("Ava", "Antony", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
