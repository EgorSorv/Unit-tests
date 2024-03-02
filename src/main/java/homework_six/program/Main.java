package homework_six.program;

import homework_six.integer_list.IntegerList;

import java.util.ArrayList;
import java.util.logging.Logger;

import static homework_six.integer_list.ListOperations.*;

/**
 * <b>Создайте программу на Python или Java, которая принимает два списка чисел и
 * выполняет следующие действия:</b><br>
 * a. Рассчитывает среднее значение каждого списка.<br>
 * b. Сравнивает эти средние значения и выводит соответствующее сообщение:<br>
 * - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.<br>
 * - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.<br>
 * - ""Средние значения равны"", если средние значения списков равны.<br><br>
 * <b>Важно:</b><br>
 * Приложение должно быть написано в соответствии с принципами объектно-ориентированного
 * программирования.<br>
 * Используйте Pytest (для Python) или JUnit (для Java) для написания тестов, которые проверяют
 * правильность работы программы. Тесты должны учитывать различные сценарии использования
 * вашего приложения.<br>
 * Используйте pylint (для Python) или Checkstyle (для Java) для проверки качества кода.<br>
 * Сгенерируйте отчет о покрытии кода тестами. Ваша цель - достичь минимум 90% покрытия.<br>
 */

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        IntegerList list1 = new IntegerList(new ArrayList<>());
        IntegerList list2 = new IntegerList(new ArrayList<>());

        logger.info("Создание первого списка\n");
        int length = getListLength();
        fillList(list1, length);

        logger.info("Создание второго списка\n");
        length = getListLength();
        fillList(list2, length);

        int averageFromList1 = list1.findAverageNum();
        int averageFromList2 = list2.findAverageNum();
        String averageCompare = averageNumCompare(averageFromList1, averageFromList2);
        logger.info(averageCompare);
    }
}
