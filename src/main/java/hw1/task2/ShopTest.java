package hw1.task2;

import java.util.ArrayList;
import java.util.List;

import static hw1.task2.Shop.getMostExpensiveProduct;
import static hw1.task2.Shop.sortProductsByPrice;
import static org.assertj.core.api.Assertions.assertThat;


public class ShopTest {
    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Яблоко", 118));
        products.add(new Product("Помидор", 124));
        products.add(new Product("Лопата", 569));
        products.add(new Product("Хлеб", 40));
        products.add(new Product("Шампунь", 346));
        products.add(new Product("Картофель", 70));
        products.add(new Product("Виноград", 210));
        products.add(new Product("Сахар", 95));
        products.add(new Product("Соль", 100));
        products.add(new Product("Мука", 120));

        // 1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
        for (Product product: products) {
            if (product.getTitle().equals("Яблоко") && product.getCost() == 118)
                System.out.println(product);
            else if (product.getTitle().equals("Помидор") && product.getCost() == 124)
                System.out.println(product);
            else if (product.getTitle().equals("Лопата") && product.getCost() == 569)
                System.out.println(product);
            else if (product.getTitle().equals("Хлеб") && product.getCost() == 40)
                System.out.println(product);
            else if (product.getTitle().equals("Шампунь") && product.getCost() == 346)
                System.out.println(product);
            else if (product.getTitle().equals("Картофель") && product.getCost() == 70)
                System.out.println(product);
            else if (product.getTitle().equals("Виноград") && product.getCost() == 210)
                System.out.println(product);
            else if (product.getTitle().equals("Сахар") && product.getCost() == 95)
                System.out.println(product);
            else if (product.getTitle().equals("Соль") && product.getCost() == 100)
                System.out.println(product);
            else if (product.getTitle().equals("Мука") && product.getCost() == 120)
                System.out.println(product);
            else
                assert false : "Неизвестный товар в списке - " + product;
        }

        // 2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
        assertThat(getMostExpensiveProduct(products))
                .isEqualTo(products.get(2));

        // 3. Напишите тесты для проверки корректности работы метода sortProductsByPrice
        // (проверьте правильность сортировки).
        assertThat(sortProductsByPrice(products))
                .endsWith(products.get(2))
                .startsWith(products.get(3))
                .containsSequence(products.get(0), products.get(9));
    }
}
