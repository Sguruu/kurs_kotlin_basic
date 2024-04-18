package kurs_kotlin_basic.lesson_2
/*
Задача 1 к Уроку 2

Задача на среднее арифметическое. В классе с углубленным изучением английского языка учится 4 человека.
У них следующие баллы по профильному предмету 3, 4, 3, 5. Пишем часть школьного софта, который посчитает средний балл
по английскому для этого класса.

 – Написать выражение, которое высчитывает средний балл;
 – Распечатать результат в консоль;
 – В консоли должно быть выведено дробное число с 2 знаками после запятой.
 */

private fun main() {
    val mass: Array<Int> = arrayOf(3, 4, 3, 5)
    var sumScore: Int = 0

    // получаем сумму всех баллов
    mass.iterator().forEach {
        sumScore += it
    }

    // получаем средний балл
    val averageScore: Float = sumScore.toFloat() / mass.size
    println(averageScore)

    main1()
}

/*
Комментарии :
Хорошее решение, но давай следовать ТЗ: в условии задачи сказано, что в классе учится 4 человека, эти данные нужно
использовать.

На будущее, закомменченный код в решении тоже не пишем.

Ответ :
Не совсем понял комментарий в части "но давай следовать ТЗ: в условии задачи сказано, что в классе учится 4 человека,
эти данные нужно использовать".
Я создал массив с 4 значениями val mass: Array = arrayOf(3, 4, 3, 5) (где каждое значение это оценка человека).
Подскажи пожалуйста что ты имел ввиду ?

Комментарии :
Смотри, у тебя хорошее решение, не стандартное, и я даже сказал бы, продвинутое. Но, "следовать ТЗ" бывает крайнее
необходимо, особенно при коллективном написании кода. Тут я имею ввиду, что нужно создать переменную с релевантным
названием, к примеру - numberOfStudents, проинициализировать ее числом - 4, и использовать в расчетах.
 */

private fun main1() {
    val numberOfStudents: Float = 4f

    val firstStudentAssessment: Float = 3f
    val secondStudentAssessment: Float = 4f
    val thirdStudentAssessment: Float = 3f
    val fourthStudentAssessment: Float = 5f

    val averageScore: Float =
        (firstStudentAssessment + secondStudentAssessment +
                thirdStudentAssessment + fourthStudentAssessment) / numberOfStudents
    println(averageScore)
}