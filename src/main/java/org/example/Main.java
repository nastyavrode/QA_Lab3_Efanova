package org.example;

/**
 * @class Main
 * @brief Главный класс программы. Точка входа.
 *
 * Создает экземпляры книги и журнала, добавляет их в библиотеку
 * и выводит информацию о содержимом библиотеки.
 */
public class Main {
    /**
     * @brief Точка входа в программу.
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", 1949, "Dystopian");
        Magazine magazine1 = new Magazine("National Geographic", "Various", 2023, 5);

        library.addItem(book1);
        library.addItem(magazine1);

        library.showItems();

        double avgYear = library.calculateAverageYear();
        System.out.printf("Average Publication Year: %.2f\n", avgYear);
    }
}
