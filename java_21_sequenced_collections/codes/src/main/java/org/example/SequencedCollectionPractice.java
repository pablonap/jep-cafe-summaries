package org.example;

import java.util.*;

public class SequencedCollectionPractice {
    public static void main( String[] args ) {
        List<String> list = new ArrayList<>(List.of("b", "c", "d"));
        list.addFirst("a"); // addFist(e) -> insert(0, e)
        System.out.println(list); // [a, b, c, d]

        list.addLast("e"); // addLast(e) -> add(e)
        System.out.println(list); // [a, b, c, d, e]

        list.removeFirst(); // removeFirst() -> remove(0)
        System.out.println(list); // [b, c, d, e]

        list.removeLast(); // removeLast() -> remove(sc.size()-1)
        System.out.println(list); // [b, c, d]

        System.out.println(list.getFirst()); // b

        System.out.println(list.getLast()); // d

        List<String> reversedList = list.reversed();
        System.out.println(reversedList); // [d, c, b]

        System.out.println("---------------");

        var elements = List.of("c", "b");
        SortedSet<String> ss = new TreeSet<>(elements);
     /* • there are no duplicates.
        • the encounter order is imposed by the comparison logic. */

        System.out.println(ss); // [b, c]
//        ss.addFirst("a"); it throws UnsupportedOperationException because it violates the sorting principle of a Set
//        ss.addLast("d"); it throws UnsupportedOperationException because it violates the sorting principle of a Set
        ss.removeFirst();
        ss.removeLast();
        System.out.println(ss); // []
        ss.add("b");
        ss.add("a");

        SortedSet<String> reversedSortedSet = ss.reversed();
        System.out.println(reversedSortedSet); // [b, a]

        System.out.println("---------------");

        var elements2 = List.of("b", "c");
     // the only case in which you're obligated to use a SequencedSet as a reference is with LinkedHashSet
        SequencedSet<String> ssLhs = new LinkedHashSet<>(elements2);
        System.out.println(ssLhs); // [a, b, c, d]

        ssLhs.addFirst("a");
        ssLhs.addLast("d");
        System.out.println(ssLhs); // [a, b, c, d]
        SequencedSet<String> ssLhsReversed = ssLhs.reversed();
        System.out.println(ssLhsReversed);
    }
}
