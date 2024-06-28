package kurs_kotlin_basic.lesson_13

/*
Урок 13 Задача 2

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

На его основе создай экземпляр. Для поля с названием компании значение по умолчанию должно быть null.

Дополни класс методом, который будет печатать информацию о контакте сообщением в одном println() и без
использования многострочного ввода такого типа (пример):

- Имя: Ростислав
- Номер: 89123456789
- Компания: Reddit

Вместо null значения, в консоль должна выводиться строка <не указано>.

Урок 13 Задача 3

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.

- создай и инициализируй (одновременно) список с 5 объектами класса-контакта;
- 2 контакта должны принимать null для поля компании;
- 1 контакт должен иметь название компании “null”;
- выведи список всех существующих компаний, которые есть в телефонной книге.

 */

private class Contact(
    val name: String,
    val phoneNumber: Long,
    val nameCompany: String?
) {
    fun printContact() {
        println(
            """
            Имя: $name
            Номер: $phoneNumber
            Компания: ${getCompanyName()}
        """.trimIndent()
        )
    }

    private fun getCompanyName(): String {
        return nameCompany ?: "не указано"
    }
}

private fun main() {
    val listContact = listOf(
        Contact(name = "name1", phoneNumber = 111, null),
        Contact(name = "name2", phoneNumber = 22, null),
        Contact(name = "name3", phoneNumber = 33, "null"),
        Contact(name = "name4", phoneNumber = 44, "nameCompany4"),
        Contact(name = "name5", phoneNumber = 55, "nameCompany5"),
    )

    listContact.forEach {
        it.printContact()
    }
}