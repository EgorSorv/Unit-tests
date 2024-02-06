package hw1.task1;

import static hw1.task1.Calculator.calculatingDiscount;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        // Проверка рачета итоговой суммы
        assertThat(calculatingDiscount(500.50, 50))
                .isEqualTo(250.25);

        // Рассчет итоговой суммы при сумме покупки 0 руб
        assertThat(calculatingDiscount(0.00, 34))
                .isEqualTo(0);

        // Рассчет итоговой суммы при скидке 0%
        assertThat(calculatingDiscount(1499.99, 0))
                .isEqualTo(1499.99);

        // Рассчет итоговой суммы при скидке 100%
        assertThat(calculatingDiscount(1499.99, 100))
                .isEqualTo(0);

        // Рассчет итоговой суммы при отрицательной сумме покупки
        assertThatThrownBy(() -> calculatingDiscount(-499.00, 24))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Недопустимые значения");

        // Рассчет итоговой суммы при отрицательной скидке
        assertThatThrownBy(() -> calculatingDiscount(499.99, -40))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Недопустимые значения");

        // Рассчет итоговой суммы при скидке больше 100%
        assertThatThrownBy(() -> calculatingDiscount(670.53, 120))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Недопустимые значения");
    }
}
