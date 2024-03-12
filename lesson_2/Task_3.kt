package kurs_kotlin_basic.lesson_2

/*
Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */

private const val HOUR_IN_MINUTE = 60
fun main() {
    val outTime: String = "9:39"
    //minutes on the way
    val onTheWayMinutes = 457

    // Разбиваем строку на части, используя разделитель ":"
    val outTimeParts = outTime.split(":")

    // Получаем часы и минуты из разделенных частей
    val outTimeHours = outTimeParts[0].toInt()
    val outTimeMinutes = outTimeParts[1].toInt()

    // Получаем минуты от начала дня
    val outAllMinutes = (outTimeHours * HOUR_IN_MINUTE) + (outTimeMinutes)

    // Получаем все минуты
    val allTravelTimeMinutes = outAllMinutes + onTheWayMinutes

    println("Время прибытия ${allTravelTimeMinutes / HOUR_IN_MINUTE}:${allTravelTimeMinutes % HOUR_IN_MINUTE}")
}