package homework_six.integer_list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

import static homework_six.integer_list.ListOperations.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerListTest {
    @Test
    void fillListTest() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        IntegerList list = new IntegerList(new ArrayList<>());

        fillList(list, 1);

        assertEquals(1, list.getList(0));
        System.setIn(sysInBackup);
    }

    @ParameterizedTest
    @CsvSource({"1.2", "-0.27", "length"})
    void fillListTestException(String value) {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream(value.getBytes());
        System.setIn(in);
        IntegerList list = new IntegerList(new ArrayList<>());

        assertThatThrownBy(() -> fillList(list, 1))
                .isInstanceOf(InputMismatchException.class)
                .hasMessage("Неверное значение. Введите, пожалуйста, целое число");
        System.setIn(sysInBackup);
    }

    @Test
    void getListLengthTest() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("7".getBytes());
        System.setIn(in);

        int length = getListLength();

        assertEquals(7, length);
        System.setIn(sysInBackup);
    }

    @Test
    void getListLengthTestException() {
        ByteArrayInputStream in = new ByteArrayInputStream("-7".getBytes());
        System.setIn(in);

        assertThatThrownBy(ListOperations::getListLength)
                .isInstanceOf(InputMismatchException.class)
                .hasMessage("Неверное значение. Введите, пожалуйста, целое положительное число");
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3, 1, 1, 1", "1, 1, 1, 0, 0, 0", "0, -1, 0, -3, -3, -3"})
    void firstAverageIsBigger(int list1num1, int list1num2, int list1num3,
                              int list2num1, int list2num2, int list2num3) {
        IntegerList list1 = new IntegerList(Arrays.asList(list1num1, list1num2, list1num3));
        IntegerList list2 = new IntegerList(Arrays.asList(list2num1, list2num2, list2num3));

        int average1 = list1.findAverageNum();
        int average2 = list2.findAverageNum();
        String result = averageNumCompare(average1, average2);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @ParameterizedTest
    @CsvSource({"1, 1, 1, 1, 2, 3", "0, 0, 0, 1, 1, 1", "-3, -3, -3, 0, -1, 0"})
    void secondAverageIsBigger(int list1num1, int list1num2, int list1num3,
                               int list2num1, int list2num2, int list2num3) {
        IntegerList list1 = new IntegerList(Arrays.asList(list1num1, list1num2, list1num3));
        IntegerList list2 = new IntegerList(Arrays.asList(list2num1, list2num2, list2num3));

        int average1 = list1.findAverageNum();
        int average2 = list2.findAverageNum();
        String result = averageNumCompare(average1, average2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @ParameterizedTest
    @CsvSource({"1, 1, 1, 1, 1, 1", "0, 0, -1, 0, -1, 0", "0, 3, 0, 3, 0, 0"})
    void averagesAreEqual(int list1num1, int list1num2, int list1num3,
                          int list2num1, int list2num2, int list2num3) {
        IntegerList list1 = new IntegerList(Arrays.asList(list1num1, list1num2, list1num3));
        IntegerList list2 = new IntegerList(Arrays.asList(list2num1, list2num2, list2num3));

        int average1 = list1.findAverageNum();
        int average2 = list2.findAverageNum();
        String result = averageNumCompare(average1, average2);

        assertEquals("Средние значения равны", result);
    }
}
