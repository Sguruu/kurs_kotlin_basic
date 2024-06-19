package kurs_kotlin_basic.lesson_13

/*
Урок 13 Задача 1

Для программы телефонного справочника создай класс, который будет хранить имя, номер телефона и компанию.
Номер телефона – целочисленное значение (Long).

При создании объекта компания может оставаться незаполненной. Вместо пустой строки поле может принимать null.

Все свойства класса не должны иметь инициализации по умолчанию.

 */

private class Contact(
    val name: String,
    val phoneNumber: Long,
    val nameCompany: String?
)

private fun main() {
    val contact1 = Contact("name", 888, null)
}