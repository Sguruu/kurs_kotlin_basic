package kurs_kotlin_basic.lesson_4

/*
Урок 4 Задача 3
Видео урок : https://youtu.be/BrW0B0fcfl0

Условие задачи : На территории агрокомплекса функционирует система автоматического мониторинга условий для роста
растений. Напиши программу, которая будет определять, подходят ли текущие условия для успешного роста бобовых культур.

Критерии благоприятных условий включают:

- наличие солнечной погоды;
- открытый тент;
- влажность воздуха составляет 20%;
- текущее время года - не зима.

Программа должна выводить результат анализа условий в формате: “Благоприятные ли условия сейчас для роста бобовых?
true/false”

Для проверки работы программы, инициализируй переменные следующими значениями:

- погода сегодня - солнечная;
- тент на данный момент - открыт;
- влажность воздуха - 20%;
- текущее время года - зима.

И типами данных - boolean, boolean, int, String.
 */

private const val IS_WEATHER_SUNNY = true
private const val IS_AWNING_OPEN = true
private const val AIR_HUMIDITY: Double = 20.0 / 100
private const val CURRENT_TIME_OF_YEAR: String = "Не зима"

fun main() {
    val currentIsWeatherSunny = true
    val currentIsAwningOpen = true
    val currentAirHumidity = 20.0 / 100
    val currentTimeOfYear: String = "Зима"
    val isFavorableConditions = currentIsWeatherSunny == IS_WEATHER_SUNNY &&
            currentIsAwningOpen == IS_AWNING_OPEN &&
            currentAirHumidity == AIR_HUMIDITY &&
            currentTimeOfYear == CURRENT_TIME_OF_YEAR

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")
}