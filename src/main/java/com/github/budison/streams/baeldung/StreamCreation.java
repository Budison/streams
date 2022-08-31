package com.github.budison.streams.baeldung;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamCreation {

    public static void main(String[] args) {

        // Creating stream using Arrays.stream()
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(arr);
        System.out.println(stream1.toList());

        // Creating stream using Stream.of()
        Stream<String> stream2 = Stream.of("d", "e", "f");
        System.out.println(stream2.toList());

        // A stream() default method is added to the Collection interface
        List<Integer> list = List.of(1, 2, 3, 4);
        Stream<Integer> stream3 = list.stream();
        System.out.println(stream3.toList());
    }
}
