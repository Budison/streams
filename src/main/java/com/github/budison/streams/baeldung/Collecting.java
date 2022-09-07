package com.github.budison.streams.baeldung;

import java.util.List;
import java.util.stream.Stream;

class Collecting {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("go", "walk", "run", "speed", "crawl");

        List<String> list = stream.map(String::toUpperCase).toList();   // .map(s -> s.toUpperCase())

        System.out.println(list);
    }
}
