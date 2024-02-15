package hw3.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOddTest {
    EvenOdd evenOdd;

    @BeforeEach
    void setup() {
        evenOdd = new EvenOdd();
    }

    @ParameterizedTest
    @CsvSource({"-2", "0", "2"})
    void checkNumForEven(int num) {
        boolean result = evenOdd.evenOddNumber(num);

        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"-1", "1"})
    void checkNumForOdd(int num) {
        boolean result = evenOdd.evenOddNumber(num);

        assertFalse(result);
    }
}
