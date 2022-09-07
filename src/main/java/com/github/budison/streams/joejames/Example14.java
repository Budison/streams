package com.github.budison.streams.joejames;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

class Example14 {

    public static void main(String[] args) {

        // Reduction - summary statistics
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summary);
    }
}
