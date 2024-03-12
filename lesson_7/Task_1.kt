package kurs_kotlin_basic.lesson_7

import java.lang.StringBuilder

/*
Урок 7 Задача 1

Создай программу, которая генерирует шестизначные пароли. Пусть пароль будет состоять из чередующихся цифр и строчных
букв латинского алфавита (без специальных символов). Например, k5p6m2. Выведи сгенерированный пароль в консоль.
 */

private const val NUMBER_OF_SIGNS = 6
fun main() {
    val charRange: CharRange = 'a'..'z'
    val intRange: IntRange = 1..9
    val generatedPassword = StringBuilder()

    for (i in 1..NUMBER_OF_SIGNS step 2) {
        generatedPassword.append(charRange.random(), intRange.random())
    }
    println(generatedPassword.toString())
}