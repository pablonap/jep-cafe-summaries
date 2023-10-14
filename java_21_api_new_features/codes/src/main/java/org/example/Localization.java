package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.stream.Stream;

public class Localization {
    public static void main( String[] args ) {
        var now = ZonedDateTime.now();
        Stream.of(
            Locale.of("en", "US"),
            Locale.of("ro", "RO"),
            Locale.of("vi", "VN")
        ).forEach(locale -> {
            Locale.setDefault(locale);

            var custom = DateTimeFormatter.ofPattern("y-MM-dd");
            var local = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

            // it's now possible to create custom localized formatters for specific patterns
            var customLocal = DateTimeFormatter.ofLocalizedPattern("yMM");

            System.out.printf( "%s  | %s | %s | %s %n",
                locale, now.format(custom), now.format(local), now.format(customLocal));
        });
    }
}
