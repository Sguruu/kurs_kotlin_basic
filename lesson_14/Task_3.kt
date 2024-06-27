package kurs_kotlin_basic.lesson_14

/*
Урок 14 Задача 3

Напиши программу для работы с геометрическими фигурами: кругом и прямоугольником. Каждая фигура имеет свой цвет и
уникальные параметры:

- для круга — радиус;
- для прямоугольника — ширину и высоту.

Создай абстрактный класс Figure с полем color. Внутри определи два абстрактных метода:

- для вычисления площади;
- для вычисления периметра.

Добавь классы-наследники для вышеупомянутых типов фигур. Реализуй методы для вычисления площади и периметра в каждом
из классов-наследников (формулы можно найти в интернете).

Создай несколько объектов разных цветов (черные и белые) и сохрани в единый список. Выведи в консоль:

- сумму периметров всех черных фигур;
- сумму площадей всех белых фигур.

 */

private const val PI: Double = 3.14
private const val COLOR_WHITE = "Белый"
private const val COLOR_BLACK = "Черный"

private abstract class Figure(
    open val color: String
) {
    abstract fun getSquare(): Double
    abstract fun getPerimeter(): Double
}

private class Circle(
    val radius: Double,
    override val color: String
) : Figure(color = color) {
    override fun getSquare(): Double {
        return PI * (radius * radius)
    }

    override fun getPerimeter(): Double {
        return 2 * PI * radius
    }
}

private class Rectangle(
    val width: Double,
    val height: Double,
    override val color: String
) : Figure(color) {
    override fun getSquare(): Double {
        return width * height
    }

    override fun getPerimeter(): Double {
        return (width + height) * 2
    }

}

private fun main() {
    val listFigure = listOf<Figure>(
        Circle(12.0, COLOR_BLACK),
        Circle(20.0, COLOR_WHITE),
        Rectangle(10.0, 5.0, COLOR_BLACK),
        Rectangle(15.0, 25.0, COLOR_WHITE)
    )

    var sumPerimetersBlackFigure: Double = 0.0
    var sumSquareWhiteFigure: Double = 0.0

    listFigure.forEach { figure ->
        when (figure.color) {
            COLOR_BLACK -> {
                sumPerimetersBlackFigure += figure.getPerimeter()
            }

            COLOR_WHITE -> {
                sumSquareWhiteFigure += figure.getSquare()
            }
        }
    }
    println("Сумма периметров всех черных фигур: $sumPerimetersBlackFigure")
    println("Сумма площадей всех белых фигур: $sumSquareWhiteFigure")
}