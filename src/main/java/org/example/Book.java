package org.example;

/**
 * @class Book
 * @brief Класс, представляющий книгу, наследуется от Item.
 *
 * Содержит дополнительное поле жанра.
 *
 * \image html book.png
 */
public class Book extends Item {
    /// Жанр книги (например, фантастика, роман)
    private String genre;

    /**
     * @brief Конструктор книги.
     * @param title Название книги.
     * @param author Автор книги.
     * @param year Год издания.
     * @param genre Жанр книги.
     */
    public Book(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    /**
     * @brief Получение информации о книге.
     * @return Строка с подробной информацией о книге.
     */
    @Override
    public String getInfo() {
        return String.format("Book: %s, Author: %s, Year: %d, Genre: %s",
                title, author, year, genre);
    }
}
