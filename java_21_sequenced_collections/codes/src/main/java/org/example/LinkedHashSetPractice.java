package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class LinkedHashSetPractice {
    public static void main( String[] args ) {
        var list = List.of("a", "b", "c", "d");
        Set<String> set = new HashSet<>(list);
        System.out.println(set); // [a, b, c, d]

        List<String> list2 = IntStream.range(1, 31).mapToObj(String::valueOf).toList();
        set.addAll(list2);
        System.out.println(set);
     /* [22, 23, 24, 25, 26, 27, 28, 29, 30, 10, 11, a, 12, b, 13, c, 14, d, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 6, 7,
         8, 9, 20, 21] */

     /* • the order has changed because a new array with a larger size was created, and it involved a rehashed of each
          element in the array. */

        Set<String> lhs = new LinkedHashSet<>(list);
        System.out.println(lhs); // [a, b, c, d]
        lhs.addAll(list2);
        System.out.println(lhs);
     /* [a, b, c, d, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
         28, 29, 30] */
    }
}
