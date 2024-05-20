package kurs_kotlin_basic.lesson_10

import kotlin.random.Random

/*
Урок 10 Задача 1

Напиши небольшую игру, в которой пользователь и компьютер по очереди бросают кости. Побеждает выбросивший наибольшее
число.

- поочередно выводи сообщение о ходе игрока и компьютера (отображать кто бросил, какие значения на кубиках);
- бросок кости вынеси в отдельную функцию, в которой генерируется случайное число от 1 до 6;
- в отдельные переменные сохрани результат работы функции для игрока и компьютера;
- после сравнения результатов, выведи соответствующее сообщение в консоль. Например: "Победило человечество" или
"Победила машина".

 */

internal fun main() {
    val humanDiceResult: Int
    val computerDiceResult: Int

    println("Добро пожаловать в игре кости.")

    if (isPlayerGoesFirst()) {
        println("Первый ходит человек")
        humanDiceResult = getDiceResult()
        println("Кость бросил человек, значение $humanDiceResult")
        computerDiceResult = getDiceResult()
        println("Кость бросил компьютер, значение $computerDiceResult")
    } else {
        println("Первый ходит компьютер")
        computerDiceResult = getDiceResult()
        println("Кость бросил компьютер, значение $computerDiceResult")
        humanDiceResult = getDiceResult()
        println("Кость бросил человек, значение $humanDiceResult")
    }

    when {
        computerDiceResult > humanDiceResult -> {
            println("Победил компьютер")
        }

        computerDiceResult < humanDiceResult -> {
            println("Победил человек")
        }

        computerDiceResult == humanDiceResult -> {
            println("Победила дружба")
        }
    }
}

internal fun isPlayerGoesFirst(): Boolean {
    return Random.nextBoolean()
}

internal fun getDiceResult(): Int {
    return Random.nextInt(from = 1, until = 6)
}
