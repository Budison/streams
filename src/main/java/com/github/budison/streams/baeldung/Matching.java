package com.github.budison.streams.baeldung;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

class Matching {

    public static void main(String[] args) {

        List<String> list = List.of("Kevin", "Thomas", "Megan", "Dirk");

        // anyMatch(), allMatch() and noneMatch()
        boolean any = list.stream().anyMatch(s -> s.contains("i"));
        System.out.println("any: " + any);

        boolean all = list.stream().allMatch(s -> s.contains("n"));
        System.out.println("all: " + all);

        boolean none = list.stream().noneMatch(s -> s.contains("c"));
        System.out.println("none: " + none);

        // Empty stream for allMatch() --> always true
        boolean allMatchEmpty = Stream.empty().allMatch(Objects::isNull);
        System.out.println("allMatch() empty: " + allMatchEmpty);

        // Empty stream for anyMatch() --> always false
        boolean anyMatchEmpty = Stream.empty().anyMatch(Objects::isNull);
        System.out.println("anyMatch() empty: " + anyMatchEmpty);
    }
}
