package de.diskostu.calc;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link Calculator}.
 */
@Log4j2
public class CalculatorTest {

    @Test
    public void testAdd() {
        // arrange
        final Calculator sut = new Calculator();

        // act
        final double result = sut.add(1, 2);

        // assert
        Assertions.assertEquals(3, result);
    }
}
