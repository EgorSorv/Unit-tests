package hw1.task2;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Shop {

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public static List<Product> sortProductsByPrice(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparingInt(Product::getCost))
                 .toList();
    }

    // Метод должен вернуть самый дорогой продукт
    public static Product getMostExpensiveProduct(List<Product> products) {
        return products.stream()
                .max(Comparator.comparing(Product::getCost))
                .orElseThrow(NoSuchElementException::new);
    }
}
