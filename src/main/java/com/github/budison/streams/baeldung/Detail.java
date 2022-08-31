package com.github.budison.streams.baeldung;

import java.util.ArrayList;
import java.util.List;

class Detail {

    private final List<String> parts = new ArrayList<>();

    List<String> getParts() {
        return parts;
    }

    void addPart(String s) {
        parts.add(s);
    }
}
