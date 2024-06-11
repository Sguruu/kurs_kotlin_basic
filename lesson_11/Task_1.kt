package kurs_kotlin_basic.lesson_11

/*
Урок 11 Задача 1

Создай класс, который будет хранить данные пользователя. В свойствах должна храниться информация об уникальном
идентификаторе, логине, пароле и почте. Названием может быть, например, User. Создай два экземпляра класса с
произвольными данными и выведи в консоль содержимое их полей.

 */

internal data class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

internal fun main() {
    val userOne = User(0, "login1", "password1", "email1")
    val userTwo = User(1, "login2", "password2", "email2")

    println("${userOne.id} ${userOne.login} ${userOne.password} ${userOne.email}")
    println("${userTwo.id} ${userTwo.login} ${userTwo.password} ${userTwo.email}")
}