package kurs_kotlin_basic.lesson_10

/*

Урок 10 Задача 5

Реализуй механизм авторизации в интернет-магазине и получения сохраненного ранее списка товаров.

Метод авторизации принимает логин и пароль, верифицирует пользователя. Креды (credentials) для входа сохрани в
константы.

При успешной авторизации метод генерирует и возвращает токен достукпа. Токен – текстовая строка, генерируемая методом
авторизации (32 символа, которые включают цифры и буквы англ. алфавита – специальные библиотеки использовать не нужно).
Подробнее https://ru.wikipedia.org/wiki/JSON_Web_Token

При неудачной авторизации метод возвращает null.

Метод получения корзины должен принимать токен и возвращать список товаров (содержимое переменной корзины, произвольный
тип данных).

Распечатай содержимое корзины или, если вернется null, оповести пользователя о неудачной авторизации. Переменные логин,
пароль и корзина проинициализированы заранее и неизменяемы.

 */

private const val LOGIN = "dyrev"
private const val PASSWORD = "qwerty123456"

internal fun main() {
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()

    val accessToken = authorization(login, password)

    if (accessToken != null) {
        println(getUserBasket(accessToken))
    } else {
        println("Авторизация прошла отрицательно удачно")
    }


}

private fun getUserBasket(accessToken: String): List<String> = listOf("Молоко", "Яйцо", "Комочек добра")
private fun authorization(login: String, password: String): String? {
    return if (LOGIN == login && PASSWORD == password) {
        generateAccessToken()
    } else {
        null
    }
}

private fun generateAccessToken(): String {
    val range = ('A'..'z').toList() + ('0'..'9').toList()
    val numberSymbol = 32
    val a = repeat(numberSymbol) {
        range.random()
    }
    return (1..numberSymbol).map {
        range.random()
    }.joinToString("")
}