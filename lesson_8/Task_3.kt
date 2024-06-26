package kurs_kotlin_basic.lesson_8

/*
Урок 8 Задача 3

Представь, что ты работаешь над приложением с рецептами (кстати, это приложение мы вместе будем разрабатывать на
практике AndroidSprint). Напиши код, который проверяет, есть ли нужный ингредиент в рецепте.

 – создай массив, в котором будет храниться список ингредиентов для определенного блюда;
 – далее через консоль запроси у пользователя информацию об ингредиенте, который он хочет найти;
 – произведи поиск элемента по массиву, используя цикл for;
 – если ингредиент в списке есть, выведи в консоль сообщение - “Ингредиент [название] в рецепте есть”;
 – если нет, сообщать: “Такого ингредиента в рецепте нет”.

Нужно доработать код,который проверяет наличие ингредиента в рецепте. Однако, не используя цикл для поиска.

 */

private fun main() {
    val arrayOfIngredients: Array<String> = arrayOf("Помидора", "Молоко", "Лягушка", "Кусочек добра", "Собачий корм")

    println("Напишите ингредиент который вы хотите найти")
    val inputIngredient: String = readln()
    val indexIngredient = arrayOfIngredients.indexOf(inputIngredient)

    if (inputIngredient in arrayOfIngredients) {
        println("Такой ингредиент есть ! Его индекс : $indexIngredient")
    } else {
        println("Ингредиент отсутсвует")
    }

}