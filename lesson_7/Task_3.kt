package kurs_kotlin_basic.lesson_7

/*
Урок 7 Задача 3

Создай программу, которая выводит все чётные числа от нуля до числа, введенного пользователем. Сначала нужно вывести в
консоль запрос на ввод числа. Полученное число сохранить в отдельную переменную. При реализации должна использоваться
прогрессия.

 */

fun main() {
    println("Введите число : ")
    val number = readln().toUInt()
    for (i in 0..number.toInt() step 2 ){
        println(i)
    }
}