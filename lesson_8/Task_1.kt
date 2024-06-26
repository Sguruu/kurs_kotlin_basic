package kurs_kotlin_basic.lesson_8

/*
Урок 8 Задача 1

Скрипт считает количество просмотров рекламы за день. Напиши программу, которая сохраняет в массив данные просмотров
за неделю (числа использовать на свое усмотрение). Каждая ячейка хранит количество просмотров за день. Имея массив с
данными, нужно посчитать сколько всего было просмотров за неделю. Результат вычислений выведи в консоль.

 */

private fun main() {
    val arrayViewPerWeek: Array<Int> = arrayOf(10, 20, 30, 40, 50, 100, 3000)
    var allView: Int = 0

    for (item in arrayViewPerWeek) {
        allView += item
    }

    println(allView)
}