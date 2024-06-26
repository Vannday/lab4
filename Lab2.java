/**
 * Класс Lab2 представляет собой основной класс программы, который демонстрирует использование класса Product и Search.
 */
public class Lab2 {

    /**
     * Точка входа в программу. В этом методе создается массив объектов класса Product, и затем вызывается метод поиска из класса Search.
     *
     * @param args аргументы командной строки (не используются в данной программе)
     */
    public static void main(String[] args) {
        // Создание массива продуктов
        Product[] products = new Product[3];

        // Инициализация объектов класса Product
        products[0] = new Product(1, "Молоко", 167891, "Москва", 99, 5, 15);
        products[1] = new Product(2, "Шоколад", 245713, "Санкт-Петербург", 72, 100, 8);
        products[2] = new Product(3, "Помидоры", 628901, "Сочи", 109, 15, 24);

        // Вызов метода поиска для массива продуктов
        Search.search(products);
    }
}
