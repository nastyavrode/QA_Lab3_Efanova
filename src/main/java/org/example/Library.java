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
}
