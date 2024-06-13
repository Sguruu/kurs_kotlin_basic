package kurs_kotlin_basic.lesson_12

/*
Урок 12 Задача 1

Программа отслеживает погоду по дням. Создай класс для хранения данных о температуре и осадках для одного дня.

Объекты класса будут хранить:

- дневная температура;
- ночная температура;
- наличие осадков в течение суток.

Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом созданного класса.

- в классе создай переменные и проинициализируй их какими-нибудь значениями;
- затем в созданных объектах подставь другие значения этим переменным.

В этой задаче используй пустой конструктор.

 */

class WeatherData {
    var daytimeTemperature: Int = 12
    var nightTemperature: Int = 10
    var isPrecipitation: Boolean = true

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
    val weatherData1 = WeatherData()
    val weatherData2 = WeatherData()

    weatherData1.daytimeTemperature = 40
    weatherData2.nightTemperature = 20
    weatherData1.isPrecipitation = false

    weatherData1.printWeatherData()
    weatherData2.printWeatherData()

}