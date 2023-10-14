package org.example;

public class StringAndStringBuilder {
    public static void main( String[] args ) {
        String message = "apple tomato banana orange";
        var index = message.indexOf("banana", 5, 25);
        System.out.println(index);

        var sb = new StringBuilder();
        sb.repeat("one ", 5);
        System.out.println(sb);
    }
}
