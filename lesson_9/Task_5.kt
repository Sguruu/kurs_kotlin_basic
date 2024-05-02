package kurs_kotlin_basic.lesson_9

import java.util.*

/*
Урок 9 Задача 5

Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).

- результат должен исключать повторы;
- список должен выводиться в алфавитном порядке;
- все элементы списка выведены в одну строку, разделяя слова запятыми;
- первый элемент должен быть распечатан с заглавной буквы.

 */

private const val NUMBER_OF_INGREDIENTS = 5

private fun main() {
    val setIngredients: MutableSet<String> = mutableSetOf()

    for (i in 0 until NUMBER_OF_INGREDIENTS) {
        println("Введите ингердиент № ${i.inc()}")
        setIngredients.add(readln())
    }

    val ingredientsString = setIngredients.joinToString(separator = ", ")
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

    println(ingredientsString)
}