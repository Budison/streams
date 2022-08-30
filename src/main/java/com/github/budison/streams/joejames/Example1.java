package com.github.budison.streams.joejames;

import java.util.stream.IntStream;

class Example1 {

    public static void main(String[] args) {

        // 1. Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println();
    }
}
