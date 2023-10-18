package org.example;

import java.util.*;

public class UnmodifiablePractice {
    public static void main( String[] args ) {
     // JDK 8:
        List<String> letters = Arrays.asList("a", "b", "c");
        System.out.println(letters);

        letters.set(0, "X");
        System.out.println(letters);

        List<String> unmodifiableLetters = Collections.unmodifiableList(letters);
//        unmodifiableLetters .set(0, "X"); // throws UnsupportedOperationException

     // JDK 9:
        List<String> unmodifiableLetters2 = List.of("a", "b", "c");
//        unmodifiableLetters2.set(0, "X"); // throws UnsupportedOperationException

        List<String> letters2 = new ArrayList<>(List.of("a", "b", "c"));
        letters2.add("d");
        SequencedCollection<String> unmodifiableLetters3 = Collections.unmodifiableSequencedCollection(letters2);
//        unmodifiableLetters3.add("e"); // throws UnsupportedOperationException

//        Other unmodifiableSequenced:
//        Collections.unmodifiableSequencedSet()
//        Collections.unmodifiableSequencedMap()
    }
}
