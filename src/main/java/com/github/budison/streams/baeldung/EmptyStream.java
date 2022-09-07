package com.github.budison.streams.baeldung;

import java.util.List;
import java.util.stream.Stream;

class EmptyStream {

    // Example use case for empty streams
    static Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

    public static void main(String[] args) {
        Stream<String> streamEmpty1 = Stream.empty();
        System.out.println("Is empty: " + streamEmpty1.findAny().isEmpty());

        Stream<String> streamEmpty2 = EmptyStream.streamOf(List.of());
        System.out.println("Is empty: " + streamEmpty2.findAny().isEmpty());
    }
}
