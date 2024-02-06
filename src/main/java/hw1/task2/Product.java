package hw1.task2;

// Мы хотим улучшить функциональность нашего интернет-магазина.
// Ваша задача - добавить два новых метода в класс Shop:
// Метод sortProductsByPrice(), который сортирует список продуктов по стоимости.
// Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт.
// Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
// (правильное количество продуктов, верное содержимое корзины).
// Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
// Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
// Используйте класс Product для создания экземпляров продуктов
// и класс Shop для написания методов сортировки и тестов.

public class Product {
    private final String title; // Название
    private final Integer cost; // Стоимость продукта

    public Product(  String title, Integer cost) {
        this.title = title;
        this.cost = cost;
    }

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Товар: " +
                "название - " +
                title +
                ", стоимость - " +
                cost;
    }
}
