package hw3.task2;

public class Interval {

    /* Разработайте и протестируйте метод numberInInterval,
    который проверяет, попадает ли переданное число в интервал (25;100).
    */

    public boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }
}
