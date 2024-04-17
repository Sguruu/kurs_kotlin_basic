package kurs_kotlin_basic.lesson_9

/*
Урок 9 Задача 3

Напиши программу, которая будет рассчитывать сколько потребуется ингредиентов для разного количества порций блюда.
Для примера возьмем рецепт омлета. Для одной порции нужно: яиц – 2шт., молока – 50 мл, сливочного масла – 15 гр.

 – создай список с количеством ингредиентов для 1 блюда (где под индексами располагается количество для яиц/молока
 /масла соответственно);
 – запроси у пользователя количество порций;
 – модернизировать список таким образом, чтобы вывести в консоль сообщение с количеством нужных ингредиентов такого
 типа: “На [количество_порций] порций вам понадобится: Яиц – n, молока – n1, сливочного масла – n2]”.

 */

fun main() {

    val listIngredients: List<Triple<String, Int, String>> = listOf(
        Triple("Яица", 2, "шт"),
        Triple("Молока", 50, "мл"),
        Triple("Сливочное масло", 15, "гр"),
    )

    println("Введите количество порций яичницы")
    //number of servings
    val numberServings: Int = readln().toInt()
    val infoEggs = listIngredients[0]
    val infoMilk = listIngredients[1]
    val infoButter = listIngredients[2]
    println(
        "На $numberServings порций вам понадобится: " +
                "${infoEggs.first} - ${infoEggs.second * numberServings} ${infoEggs.third}, " +
                "${infoMilk.first} - ${infoMilk.second * numberServings} ${infoMilk.third}, " +
                "${infoButter.first} - ${infoButter.second * numberServings} ${infoButter.third}, "
    )
}