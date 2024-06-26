package kurs_kotlin_basic.lesson_3

/*
Урок 5 Задача 5
Видео урок : https://youtu.be/2oIJSVBcXE0?si=XbtWlWaOJZbKrIiH

Условие задачи : Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку,
отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.

Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих: откуда, куда и номер хода,
присвоить соответствующим переменным и распечатать по отдельности.
 */

private fun main() {
    val serverResponse: String = "D2-D4;0"

    val listString = serverResponse.split(delimiters = arrayOf("-", ";"))

    listString.forEach {
        println(it)
    }
}