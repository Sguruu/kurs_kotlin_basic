package kurs_kotlin_basic.lesson_12

import kotlin.random.Random

/*

Урок 12 Задача 5

Продолжи усовершенствовать программу, теперь она должна рассчитывать средние значения температур и считать к
оличество дней с осадками за месяц.

Представь, что данные ты получаешь от датчиков. Сымитируй их поведение с помощью random.

- в функции main() создай список и добавь в него с помощью цикла 30 объектов класса, передав в конструкторы случайные
значения;
- сохрани в отдельные списки дневные и ночные температуры, а также список дней с осадками;
- вычисли средние значения дневных и ночных температур с помощью специальной extension-функции из стандартной
библиотеки;
- посчитай количество дней с осадками.

Выведи результаты в консоль

 */

// - 50 по градусам цельсия
const val MIN_KELVIN = 223
// + 100 по градусам целься
const val MAX_KELVIN = 273
class WeatherDataTask5() {
    var daytimeTemperature: Int = 12
    var nightTemperature: Int = 10
    var isPrecipitation: Boolean = true

    constructor(
        daytimeTemperatureKelvin: Int,
        nightTemperatureKelvin: Int,
    ) : this() {
        this.daytimeTemperature = daytimeTemperatureKelvin - 273
        this.nightTemperature = nightTemperatureKelvin - 273
    }

    fun printWeatherData() {
        println(
            """
              Дневная температура : $daytimeTemperature
              Ночная температура : $nightTemperature
              Наличие осатков в течении сутков : $isPrecipitation
          """.trimIndent()
        )
    }
}

private fun main() {
    val listWeatherData = List(30) { index: Int ->
        WeatherDataTask5(
            daytimeTemperatureKelvin = Random.nextInt(223, 373),
            nightTemperatureKelvin = Random.nextInt(223, 373)
        ).also {
            it.isPrecipitation = Random.nextBoolean()
        }
    }

    val listDaytimeTemperature: List<Int> = listWeatherData.map { it.daytimeTemperature }
    val listNightTemperature: List<Int> = listWeatherData.map { it.nightTemperature }
    val precipitationDays: List<WeatherDataTask5> = listWeatherData.filter {
        it.isPrecipitation
    }

    println("Средние значение дневных температур : ${listDaytimeTemperature.average()}")
    println("Средние значение ночных температур : ${listNightTemperature.average()}")
    println("Количество дней с осатками : ${precipitationDays.size}")

}