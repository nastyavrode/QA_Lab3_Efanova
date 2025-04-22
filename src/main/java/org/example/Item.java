package org.example;

/**
 * @class Item
 * @brief Абстрактный базовый класс, представляющий элемент библиотеки.
 *
 * Класс содержит общие поля, такие как название, автор и год публикации.
 * Используется как основа для производных классов Book и Magazine.
 */
public abstract class Item {
    /// Название элемента
    protected String title;

    /// Автор или редакция
    protected String author;

    /// Год публикации
    protected int year;

    /**
     * @brief Конструктор базового элемента.
     * @param title Название элемента.
     * @param author Автор элемента.
     * @param year Год публикации.
     */
    public Item(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    /**
     * @brief Абстрактный метод получения информации об элементе.
     * @return Строка с информацией об элементе.
     */
    public abstract String getInfo();
}
