package com.github.budison.streams.baeldung;

import java.util.List;

class ParallelStream {

    public static void main(String[] args) {

        // parallelStream() allows the stream library to do the filtering and counting in parallel
        List<Integer> list = List.of(10, 20, 3, 4);
        long count = list.parallelStream()
                .filter(integer -> integer > 5)
                .count();
        System.out.println(count);
    }
}
