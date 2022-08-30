package com.github.budison.streams.joejames;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

class Example8 {

    public static void main(String[] args) throws IOException {

        // 8. Stream rows from text file, sort, filter and print
        Stream<String> bands = Files.lines(Paths.get("src/main/resources/bands.txt"));
        bands.sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close();      // close to prevent memory leaks
    }
}
