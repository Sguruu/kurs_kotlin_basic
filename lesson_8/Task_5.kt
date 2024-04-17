package kurs_kotlin_basic.lesson_8

/*
Урок 8 Задача 5

Напиши программу, которая должна создавать массив из определенного количества ингредиентов, которые будет вводить пользователь.

- элементы вводятся по одному;
- перед вводом элементов сначала запрашивается количество планируемых ингредиентов;
- запрещено использовать список или динамический массив.

 */

fun main() {
    println("Какое количество ингредиентов планируется создать ? : ")
    val numberOfIngredients = readln().toInt()
    val initArrayLambda: (Int) -> String = {
        println("Введите ${it.inc()} ингредиент")
        readln()
    }
    val array = Array<String>(size = numberOfIngredients, init = initArrayLambda)

    println("Введеные ингредиенты : ")
    array.forEach {
        println(it)
    }
}