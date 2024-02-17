package hw3.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntervalTest {
    Interval interval;

    @BeforeEach
    void setup() {
        interval = new Interval();
    }

    @ParameterizedTest
    @CsvSource({"25", "100", "1000", "-30"})
    void NumNotInInterval(int num) {
        boolean result = interval.numberInInterval(num);

        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"26", "99", "50"})
    void NumInInterval(int num) {
        boolean result = interval.numberInInterval(num);

        assertTrue(result);
    }
}
