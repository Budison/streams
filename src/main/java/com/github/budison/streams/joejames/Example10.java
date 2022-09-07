package com.github.budison.streams.joejames;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

class Example10 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/data.txt");

        // Stream rows from CSV file and count
        Stream<String> rows = Files.lines(path);
        int rowCount = (int) rows
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " row(s)");
        rows.close();

        // Stream rows from CSV file and count second value over 15
        Stream<String> data = Files.lines(path);
        int overCount = (int) data
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .count();
        System.out.println(overCount + " row(s)");
        data.close();
    }
}
