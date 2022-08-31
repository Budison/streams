package com.github.budison.streams.baeldung;

import java.util.ArrayList;
import java.util.stream.Stream;

class Filtering {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        Stream<String> stream = list.stream().filter(s -> s.contains("d"));

        System.out.println(stream.toList());
    }
}
