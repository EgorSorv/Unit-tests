package hw1.task1;

// В классе Calculator создайте метод calculateDiscount,
// который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
// Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
// Если метод calculateDiscount получает недопустимые аргументы,
// он должен выбрасывать исключение ArithmeticException.
// Не забудьте написать тесты для проверки этого поведения.

public class Calculator {
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount >= 0 && discountAmount >= 0 && discountAmount <= 100)
            return purchaseAmount * (100 - discountAmount) / 100;
        else throw new ArithmeticException("Недопустимые значения");
    }
}
