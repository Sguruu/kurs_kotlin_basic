package kurs_kotlin_basic.lesson_3
/*
Урок 3 Задача 1
Видео урок : https://youtu.be/2oIJSVBcXE0?si=XbtWlWaOJZbKrIiH

Условие задачи : При входе в приложение высвечивается приветствие. Представим, что мы пишем функцию, которая будет
выводить приветствие с именем пользователя на экран (в нашем случае в консоль). Tекст приветствия может меняться в
зависимости от времени суток. Так, например, выводится приветствие при входе в приложение Сбербанка.
Приветствие и имя пользователя должны храниться в отдельных переменных. Вывести в консоль два приветствия
(для дня и для вечера), перезаписывая данные в одну исходную переменную.
 */

fun main() {
    val welcomeTextEvenings: String = "Добрый вечер"
    val welcomeTextDay: String = "Добрый день"
    val nameUser: String = "Сыч"

    var outTextWelcome: String

    outTextWelcome = "$welcomeTextEvenings, $nameUser !"
    println(outTextWelcome)

    outTextWelcome = "$welcomeTextDay, $nameUser !"
    println(outTextWelcome)
}