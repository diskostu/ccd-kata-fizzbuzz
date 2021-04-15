package de.diskostu.kata.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private final FizzBuzz sut = new FizzBuzz();

    @Test
    public void testCreateFizzBuzz() {
        // arrange
        final int from = 1;
        final int to = 20;

        // act
        final List<String> fizzBuzzList = sut.createFizzBuzz(from, to);
        final String fizzBuzzString = String.join("", fizzBuzzList);

        // assert
        assertThat(fizzBuzzList).hasSize(20);
        assertThat(fizzBuzzString).isEqualTo("12fizz4buzzfizz78fizzbuzz11fizz1314fizzbuzz1617fizz19buzz");
    }
}
