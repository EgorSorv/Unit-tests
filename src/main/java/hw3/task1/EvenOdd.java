package hw3.task1;

public class EvenOdd {
    /* Напишите тесты, покрывающие на 100% метод evenOddNumber,
    который проверяет, является ли переданное число четным или нечетным.
    */

    public boolean evenOddNumber ( int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
