package com.github.budison.streams.joejames;

import java.util.stream.IntStream;

class Example3 {

    public static void main(String[] args) {

        // Integer Stream with sum
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum()
        );
    }
}
