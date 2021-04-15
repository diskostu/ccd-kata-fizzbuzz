package de.diskostu.kata.countChars;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CountCharsTest {

    private final CountChars sut = new CountChars();


    @Test
    public void testCountChars() {
        // arrange
        final String input = "Das darf nicht sein";
        final Map<Character, Integer> expectedResult = new LinkedHashMap<>();
        expectedResult.put('D', 1);
        expectedResult.put('a', 2);
        expectedResult.put('s', 2);
        expectedResult.put(' ', 3);
        expectedResult.put('d', 1);
        expectedResult.put('r', 1);
        expectedResult.put('f', 1);
        expectedResult.put('n', 2);
        expectedResult.put('i', 2);
        expectedResult.put('c', 1);
        expectedResult.put('h', 1);
        expectedResult.put('t', 1);
        expectedResult.put('e', 1);

        // act
        Map<Character, Integer> result = sut.countChars(input);

        // assert
        assertThat(result).isEqualTo(expectedResult);
    }
}
