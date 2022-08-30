package com.github.budison.streams.joejames;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Example12 {

    public static void main(String[] args) throws IOException {

        // 12. Stream rows from CSV file, store fields in HashMap
        Stream<String> rows = Files.lines(Paths.get("src/main/resources/data.txt"));

        Map<String, Integer> map;

        map = rows
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])
                ));

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        rows.close();
    }
}
