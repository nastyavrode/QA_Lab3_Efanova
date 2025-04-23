package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @class Library
 * @brief Класс, управляющий коллекцией элементов библиотеки.
 *
 * Позволяет добавлять книги и журналы, а также выводить информацию о них.
 */
public class Library {
    /// Список всех элементов библиотеки (книг и журналов)
    private List<Item> items;

    /**
     * @brief Конструктор класса Library.
     * Создает пустую коллекцию элементов.
     */
    public Library() {
        items = new ArrayList<>();
    }

    /**
     * @brief Добавляет элемент в библиотеку.
     * @param item Элемент (Book или Magazine), который нужно добавить.
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * @brief Выводит информацию обо всех элементах библиотеки.
     */
    public void showItems() {
        for (Item item : items) {
            System.out.println(item.getInfo());
        }
    }

    /**
     * @brief Вычисляет средний год публикации всех элементов библиотеки.
     *
     * \f[
     * \text{Средний год} = \frac{\sum_{i=1}^{n} \text{year}_i}{n}
     * \f]
     *
     * @return Средний год публикации или 0, если библиотека пуста.
     */
    public double calculateAverageYear() {
        if (items.isEmpty()) return 0;

        int sum = 0;
        for (Item item : items) {
            sum += item.year;
        }

        return (double) sum / items.size();
    }
}