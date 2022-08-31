package com.github.budison.streams.baeldung;

import java.util.List;

class Reduction {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 1, 1);
        Integer reduced = list.stream().reduce(23, (a, b) -> a + b);
        System.out.println(reduced);
    }
}
