package kurs_kotlin_basic.lesson_12

/*
Урок 12 Задача 3

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

- в этой задаче используй первичный конструктор без выделения памяти под свойства;
- поля должны быть объявлены и проинициализированы в теле класса;
- все поля с температурой должны иметь тип Int;
- программа не должна иметь других функций, кроме метода вывода информации о погоде.

В конструктор передается температура в Кельвинах. При обращении к полям с температурой возвращаются данные в Цельсиях.

Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.

 */

class WeatherDataTask3() {
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
    val weatherData1 = WeatherDataTask3()
    val weatherData2 = WeatherDataTask3(280, 300)

    weatherData1.daytimeTemperature = 40
    weatherData1.isPrecipitation = false

    weatherData1.printWeatherData()
    weatherData2.printWeatherData()
}