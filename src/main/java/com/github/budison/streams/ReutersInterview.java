package com.github.budison.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ReutersInterview {

    public static void main(String[] args) {

        var data = Arrays.asList("f10", "f15", "f2", "f4", "f4");

        List<String> ret = data
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(data);
        System.out.println(ret);

    }
}
