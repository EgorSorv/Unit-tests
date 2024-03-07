package homework_six.integer_list;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ListOperations {
    private static final Logger logger = Logger.getLogger(ListOperations.class.getName());
    private static final Scanner scanner = new Scanner(System.in);

    public static String averageNumCompare(int num1, int num2) {
        if (num1 > num2)
            return "Первый список имеет большее среднее значение";
        else if (num1 < num2)
            return "Второй список имеет большее среднее значение";
        else
            return "Средние значения равны";
    }

    public static int getListLength() {
        int length;

        try {
            logger.info("Введите длину массива в виде целого положительного числа:");
            length = scanner.nextInt();

            if (length <= 0)
                throw new InputMismatchException
                        ("Неверное значение. Введите, пожалуйста, целое положительное число");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неверное значение. Введите, пожалуйста, целое положительное число");
        }

        return length;
    }

    public static void fillList(IntegerList list, int length) {
        logger.info("Введите содержимое массива:");

        try {
            for (int i = 0; i < length; i++)
                list.setList(scanner.nextInt());
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неверное значение. Введите, пожалуйста, целое число");
        }
    }
}
