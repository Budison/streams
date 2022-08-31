package com.github.budison.streams.baeldung;

import java.util.List;

class Iteration {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4);

        // Looping without streams
        for (Integer integer : list) {
            if (integer > 2) {
                // count++;
            }
        }

        // Code above changed using Streams API
        long count = list
                .stream()
                .filter(integer -> integer > 2)
                .count();

        System.out.println(count);
    }
}
