package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matching {
    public static void main( String[] args ) {
        // Naming the capturing groups in regular expressions
        String line = "1; New York; 8 336 817";

        Pattern pattern =
            Pattern.compile("""
                (?<index>\\d+);\
                (?<city>[ a-zA-Z]+);\
                (?<population>[ \\d]+)$""");

        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            var index = matcher.group("index");
            var city = matcher.group("city");
            var population = matcher.group("population");

            System.out.println(index);
            System.out.println(city);
            System.out.println(population);
        }
    }
}
