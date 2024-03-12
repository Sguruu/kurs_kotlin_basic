package kurs_kotlin_basic.lesson_4

import java.util.*

/*
Урок 4 Задача 5
Видео урок : https://youtu.be/BrW0B0fcfl0

Научно-исследовательский корабль может приступить к долгосрочному плаванию при выполнении следующих условий:

- корабль не имеет повреждений;
- число экипажа составляет от 55 до 70 человек (включительно);
- на борту есть более 50 ящиков провизии;
- погода благоприятная или неблагоприятная.

Альтернативно, корабль может отплыть даже при наличии незначительных повреждений, при условии что:

- на борту рекомендованный состав экипажа - 70 человек;
- погода благоприятна;
- на борту есть 50 и более ящиков провизии.

В качестве входных данных используй информацию, введенную через консоль:

- наличие повреждений корпуса (Boolean переменная);
- текущий состав экипажа;
- количество ящиков с провизией на борту;
- благоприятность метеоусловий (Boolean переменная).

Напиши программу, которая будет определять, может ли корабль отправиться в плавание. Программа должна анализировать эти
данные и выводить результат в консоль. Для анализа должно использоваться единое составное условие, состоящее только из
логических операторов.
 */
private const val RECOMMENDED_NUMBER_OF_CREW = 70
private const val MIN_NUMBER_OF_CREW = 55
private const val NUMBER_OF_BOXES_PROVISIONS = 50

fun main() {
    println("Наличие повреждений корпуса true/false")
    val presenceOfDamageCase: Boolean = readln().toBoolean()
    println("Текущий состав экипажа Int")
    val numberOfCrew: Int = readln().toInt()
    println("Kоличество ящиков с провизией на борту Int")
    val numberOfBoxesProvisions: Int = readln().toInt()
    println("Благоприятность метеоусловий true/false")
    val favorableWeatherConditions: Boolean = readln().toBoolean()

    val isReadyShipToSail =
        (presenceOfDamageCase == false &&
                numberOfCrew >= MIN_NUMBER_OF_CREW &&
                numberOfCrew <= RECOMMENDED_NUMBER_OF_CREW &&
                numberOfBoxesProvisions > NUMBER_OF_BOXES_PROVISIONS) ||
                (numberOfCrew == RECOMMENDED_NUMBER_OF_CREW &&
                favorableWeatherConditions == true &&
                numberOfBoxesProvisions >= NUMBER_OF_BOXES_PROVISIONS)


    println("Может ли корабыль отправиться в плаванье : $isReadyShipToSail")
}