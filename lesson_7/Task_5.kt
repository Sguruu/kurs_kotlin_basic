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
private const val FIRST_CHARACTERS_OF_PASSWORD = 3
fun main() {
    val lowercaseCharRange: CharRange = 'a'..'z'
    val capitalCharRange: CharRange = 'A'..'Z'
    val intRange: IntRange = 1..9
    val listRange: List<ClosedRange<*>> = listOf(lowercaseCharRange, capitalCharRange, intRange)
    val generatedPassword  = StringBuilder()
    var passwordLength: Int

    do {
        println("Введите длину пароля :")
        passwordLength = readln().toInt()
        if (passwordLength < NUMBER_OF_SIGNS_MIN) {
            println("Длина пароля должна быть не менее 6 знаков")
        }
    } while (passwordLength < NUMBER_OF_SIGNS_MIN)

    // Добавляем три обязательных символа.
    generatedPassword.append(lowercaseCharRange.random())
    generatedPassword.append(capitalCharRange.random())
    generatedPassword.append(intRange.random())

    for (i in 1..passwordLength - FIRST_CHARACTERS_OF_PASSWORD) {
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

    println(generatedPassword.toList().shuffled())
}
