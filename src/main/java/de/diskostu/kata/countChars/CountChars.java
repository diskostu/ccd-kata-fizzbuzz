package de.diskostu.kata.countChars;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://ccd-school.de/coding-dojo/function-katas/zeichen-zaehlen/
 */
public class CountChars {
    public Map<Character, Integer> countChars(final String input) {
        final Map<Character, Integer> output = new LinkedHashMap<>();

        for (final char c : input.toCharArray()) {
            if (output.containsKey(c)) {
                final Integer integer = output.get(c);
                output.put(c, integer + 1);
            } else {
                output.put(c, 1);
            }
        }

        return output;
    }
}
