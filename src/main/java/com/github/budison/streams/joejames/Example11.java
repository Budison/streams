package com.github.budison.streams.joejames;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

class Example11 {

    public static void main(String[] args) throws IOException {

        // Stream rows from CSV file, parse data from rows
        Stream<String> rows = Files.lines(Paths.get("src/main/resources/data.txt"));
        rows.map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
        rows.close();
    }
}
