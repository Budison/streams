package com.github.budison.streams.joejames;

import java.util.stream.Stream;

class Example13 {

    public static void main(String[] args) {

        // Reduction - sum
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, Double::sum);    // (Double a, Double b) -> a + b
        System.out.println("Total = " + total);
    }
}
