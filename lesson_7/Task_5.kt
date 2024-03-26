package kurs_kotlin_basic.lesson_7

import java.lang.StringBuilder
import kotlin.random.Random

/*
Урок 7 Задача 5

Создай программу, которая генерирует более сложные пароли.

– пароль должен содержать цифры, строчные и заглавные буквы - должны присутствовать все три вида символов;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем;
– минимальная длина пароля 6 символов.
 */

private const val NUMBER_OF_SIGNS_MIN = 6
fun main() {
    val lowercaseCharRange: CharRange = 'a'..'z'
    val capitalCharRange: CharRange = 'A'..'Z'
    val intRange: IntRange = 1..9
    val listRange: List<ClosedRange<*>> = listOf(lowercaseCharRange, capitalCharRange, intRange)
    val generatedPassword = StringBuilder()
    var passwordLength: Int

    do {
        println("Введите длину пароля :")
        passwordLength = readln().toInt()
        if (passwordLength < NUMBER_OF_SIGNS_MIN) {
            println("Длина пароля должна быть не менее 6 знаков")
        }
    } while (passwordLength < NUMBER_OF_SIGNS_MIN)

    do {
        // Очистка StringBuilder
        generatedPassword.clear()
        // Генерация рандомного пароля
        for (i in 1..passwordLength) {
            val randomRange: ClosedRange<*> = listRange[Random.nextInt(listRange.size)]
            when (randomRange) {
                is CharRange -> {
                    generatedPassword.append(randomRange.random())
                }

                is IntRange -> {
                    generatedPassword.append(randomRange.random())
                }
            }
        }

        // Проверка что присутсвуют все три вида символов
        var isPasswordValid: Boolean = false
        var isAvailabilityLowercaseChar: Boolean = false
        var isAvailabilityCapitalChar: Boolean = false
        var isIntChar: Boolean = false

        for (item in generatedPassword) {
            when {
                item in lowercaseCharRange -> isAvailabilityLowercaseChar = true
                item in capitalCharRange -> isAvailabilityCapitalChar = true
                item.digitToInt() in intRange -> isIntChar = true
            }
            if (isAvailabilityLowercaseChar && isAvailabilityCapitalChar && isIntChar) {
                isPasswordValid = true
                break
            }
        }
    } while (!isPasswordValid)

    println(generatedPassword)
}
