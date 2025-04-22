package org.example;

/**
 * @class Magazine
 * @brief Класс, представляющий журнал, наследуется от Item.
 *
 * Содержит дополнительное поле номера выпуска.
 */
public class Magazine extends Item {
    /// Номер выпуска журнала
    private int issueNumber;

    /**
     * @brief Конструктор журнала.
     * @param title Название журнала.
     * @param author Автор (чаще всего — редакция).
     * @param year Год выпуска.
     * @param issueNumber Номер выпуска.
     */
    public Magazine(String title, String author, int year, int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;
    }

    /**
     * @brief Получение информации о журнале.
     * @return Строка с подробной информацией о журнале.
     */
    @Override
    public String getInfo() {
        return String.format("Magazine: %s, Author: %s, Year: %d, Issue: %d",
                title, author, year, issueNumber);
    }
}
