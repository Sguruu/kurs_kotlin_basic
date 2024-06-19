package kurs_kotlin_basic.lesson_14

/*
Урок 14 Задача 1

В компьютерной игре есть три типа кораблей: лайнер, грузовой и ледокол. Все корабли построены на основе лайнера,
но у каждого свой функционал и дополнительные свойства.

У грузовых скорость меньше, а грузоподъемность больше. У ледоколов ниже и скорость, и вместительность, но они могут
колоть лёд. Лайнер может вмещать наибольшее количество пассажиров.

- спроектируй иерархию классов со значениями по умолчанию для каждого типа корабля;
- создай по 1 экземпляру каждого типа корабля.

 */

private open class Liner(
    val speed: Int = 1000,
    val capacity: Int = 100,
    val loadCapacity: Int = 100
)

private class CargoShip() : Liner(speed = 100, capacity = 1000, loadCapacity = 20)

private class IcebreakerShip() : Liner(speed = 50, capacity = 500, loadCapacity = 100) {
    fun crushIce() {
        println("Корабль колит лед")
    }
}

private fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreakerShip = IcebreakerShip()
}