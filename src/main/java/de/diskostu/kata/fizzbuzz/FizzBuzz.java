package de.diskostu.kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Taken from https://ccd-school.de/coding-dojo/function-katas/fizzbuzz/
 */
public class FizzBuzz {
    public List<String> createFizzBuzz(int from, int to) {
        final List<String> fizzBuzzList = new ArrayList<>(to - from);

        for (int i = from; i <= to; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzList.add("fizzbuzz");
            } else if (i % 5 == 0) {
                fizzBuzzList.add("buzz");
            } else if (i % 3 == 0) {
                fizzBuzzList.add("fizz");
            } else {
                fizzBuzzList.add(String.valueOf(i));
            }
        }

        return fizzBuzzList;
    }
}
