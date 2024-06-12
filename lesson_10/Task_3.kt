package kurs_kotlin_basic.lesson_10

import java.lang.StringBuilder

/*
Урок 10 Задача 3

Напиши программу, которая генерирует пароли. Пароль должен состоять из последовательно чередующихся цифр и
специальных символов. Например, 4#4%2!.

- пользователь сам задает длину пароля;
- для генерации пароля должна быть отдельная функция, принимающая целочисленное значение длины пароля и
возвращающая готовый пароль;
- пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и пробел (всего 16 спецсимволов).

 */

internal fun main() {
    println("Введите длину пароля : ")
    val passwordLength = readln().toUInt()
    println("Ваш пароль : ${getGeneratePassword(passwordLength)}")
}

internal fun getGeneratePassword(passwordLength: UInt): String {
    val intRange: IntRange = 1..9
    val specialSymbols = ' '..'/'
    val generatedPassword = StringBuilder()

    for (i in 1..passwordLength.toInt()) {
        if (i % 2 == 0) {
            generatedPassword.append(intRange.random())
        } else {
            generatedPassword.append(specialSymbols.random())
        }
    }
    return generatedPassword.toString()
}