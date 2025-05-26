package lab_14;

public class ex_1 {
    public static void main(String[] args) {
        // Создаем товары
        Product product1 = new Product("Хлеб", 25.50);
        Product product2 = new Product("", -100); // некорректные данные
        Product product3 = new Product("Молоко"); // только имя

        // Выводим результат
        System.out.println(product1); // Product[name=Хлеб, price=25.5]
        System.out.println(product2); // Product[name=Без названия, price=0.0]
        System.out.println(product3); // Product[name=Молоко, price=0.0]

        // Используем методы записи
        System.out.println("Товар: " + product1.name());
        System.out.println("Цена: " + product1.price());
    }
}

// Простая запись для хранения данных о товаре
record Product(String name, double price) {

    // Частичное переопределение канонического конструктора
    // для проверки и коррекции данных
    public Product {
        // Проверяем имя товара
        if (name == null || name.isEmpty()) {
            name = "Без названия";
        }

        // Проверяем цену
        if (price < 0) {
            price = 0.0;
        }
    }

    // Дополнительный конструктор
    public Product(String name) {
        this(name, 0.0); // вызываем основной конструктор
    }
}



