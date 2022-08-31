package com.github.budison.streams.baeldung;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Mapping {

    public static void main(String[] args) {

        List<String> uris = new ArrayList<>();
        uris.add("src/main/resources/data.txt");

        // Converting Stream<String> to Stream<Path>
        Stream<Path> stream = uris.stream().map(Paths::get);
        System.out.println(stream.toList());

        // Converting Stream<Detail> to Stream<String> by extracting every element from the field PARTS, which is a list
        List<Detail> details = new ArrayList<>();

        Detail d1 = new Detail();
        d1.addPart("Part1");
        d1.addPart("Part2");

        Detail d2 = new Detail();
        d2.addPart("Part3");
        d2.addPart("Part4");

        details.add(d1);
        details.add(d2);

        Stream<String> stream2 = details.stream().flatMap(detail -> detail.getParts().stream());
        System.out.println(stream2.toList());
    }
}
