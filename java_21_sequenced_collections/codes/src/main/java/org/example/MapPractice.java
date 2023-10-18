package org.example;

import java.util.*;

public class MapPractice {
    public static void main( String[] args ) {
        SortedMap<Integer, String> idsByName = new TreeMap<>();
        idsByName.put(2, "b");
        idsByName.put(3, "c");
        idsByName.put(1, "a");

        idsByName.entrySet().forEach(e -> System.out.printf("key: %d and value: %s\n", e.getKey(), e.getValue()));

//        idsByName.putFirst(4, "d"); it throws UnsupportedOperationException because it violates the sorting principle of a SortedMap

        System.out.println("-------------------------");

        SequencedMap<Integer, String> idsByName2 = new LinkedHashMap<>();
        idsByName2.put(2, "b");
        idsByName2.put(3, "c");
        idsByName2.put(1, "a");

        idsByName2.entrySet().forEach(e -> System.out.printf("key: %d and value: %s\n", e.getKey(), e.getValue()));

        System.out.println("-------------------------");

        idsByName2.putFirst(4, "d");
        idsByName2.entrySet().forEach(e -> System.out.printf("key: %d and value: %s\n", e.getKey(), e.getValue()));
    }
}
