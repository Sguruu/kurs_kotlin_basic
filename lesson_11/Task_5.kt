package kurs_kotlin_basic.lesson_11

import kotlin.random.Random

/*

Урок 11 Задача 5

Реализовать класс работы форума (Forum). Для реализации создай дополнительные классы для сущностей “Член форума”
(с полями userId и userName) и “Сообщение форума” (с полями authorId и message).

Примени паттерн “Фабрика” для создания пользователей и сообщений форума. Напрямую объекты не создаются, логика
должна быть инкапсулирована внутри методов класса.

- createNewUser() создает новых пользователей, принимая имя пользователя. Метод сохраняет нового пользователя в общий
список и одновременно возвращает новый объект. Генерация id-шников новых пользователей происходит внутри;
- createNewMessage() создает сообщения, принимая id пользователя. Сообщения создаются только если такой пользователь
есть на форуме;
- printThread() печатает в консоль все сообщения добавленные на форум в формате:

    автор: сообщение
    автор: сообщение

Создай экземпляр Forum и продемонстрируй его работу, добавив двух пользователей и по два сообщения от
каждого пользователя.

 */

internal class Forum() {
    private val listUsers = mutableSetOf<MemberForum>()
    private val messagesForum = mutableSetOf<MessageForum>()


    fun createNewUser(userName: String): MemberForum {
        return MemberForum(generateId(), userName).also {
            listUsers.add(it)
        }
    }

    fun createNewMessage(userId: Int, message: String) {
        if (listUsers.any { it.userId == userId }) {
            messagesForum.add(MessageForum(userId, message))
        }
    }

    fun printThread() {
        messagesForum.forEach { messagesForum ->
            val memberForum = listUsers.first { memberForum ->
                memberForum.userId == messagesForum.authorId
            }
            println("${memberForum.userName} : ${messagesForum.message}")
        }
    }

    private fun generateId(): Int = Random.nextInt()
}

internal class MemberForum(val userId: Int, val userName: String)

internal class MessageForum(val authorId: Int, val message: String)

internal fun main() {
    val forum = Forum()
    forum.printThread()

    val memberForum1 = forum.createNewUser("Сережа")
    val memberForum2 = forum.createNewUser("Леха")

    forum.createNewMessage(memberForum1.userId,"Леха ты где ?")
    forum.createNewMessage(memberForum1.userId,"Опять Леха пропал")
    forum.createNewMessage(memberForum2.userId,"Я тут !")
    forum.printThread()
}