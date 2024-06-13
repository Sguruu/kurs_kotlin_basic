package kurs_kotlin_basic.lesson_11

/*
Урок 11 Задача 3

Прокачиваем абстрактное мышление. Задача на проектирование сущностей для упрощенной версии приложения социальной сети,
в которой общаются только голосом. Требуется описать сущности и имитировать действия методами.

Функционал одного из модулей будет такой. Есть лента, в которой отображаются “комнаты” для общения по интересам.
В карточке “комнаты” отображается:

- обложка;
- название;
- список участников — отображаются в виде аватарок. При долгом нажатии на аватар подсветится его никнейм.
Рядом с аватаркой отображается текстовый бейдж с одним из возможных статусов говорящего: “разговаривает”,
“микрофон выключен”, “пользователь заглушен”.

Класс должен содержать методы:

– добавления участника (принимает объект участника и сохраняет в свойство комнаты);
– обновления статуса (принимает имя пользователя и новый статус).

После проектирования создай объект комнаты с произвольными данными.

 */

private class Room(
    val cover: String,
    val name: String,
    val users: MutableList<User>,
) {
    private val generatedIds = mutableSetOf<Int>()
    fun addUser(avatarUrl: String, status: StatusUser = StatusUser.MUTED) {
        users.add(
            User(
                id = generateId(),
                avatarUrl = avatarUrl,
                status = status
            )
        )
    }

    fun setStatusUser(status: StatusUser, id: Int) {
        val userEdit = users.first { user ->
            user.id == id
        }
        users[users.indexOf(userEdit)].status = status
    }

    private fun generateId(): Int {
        val range = 1..1000
        return range.first {
            it !in generatedIds && it !in users.map { it.id }
        }.also { newId ->
            generatedIds.add(newId)
        }
    }
}

private data class User(
    val id: Int,
    // какая то ссылка на аватарку пользователя
    val avatarUrl: String,
    var status: StatusUser = StatusUser.MUTED,
)

private enum class StatusUser(val description: String) {
    TALKS("разговаривает"),
    MICROPHONE_IS_OFF("микрофон выключен"),
    MUTED("пользователь заглушен");
}

private fun main() {
    val room = Room(
        cover = "cover",
        name = "name",
        users = mutableListOf(
            User(
                avatarUrl = "avatarUrl",
                id = 1,
                status = StatusUser.TALKS,
            ),
            User(
                avatarUrl = "avatarUrl1",
                id = 2,
            )
        )
    )

    println(room.users.joinToString())

    room.addUser(avatarUrl = "avatarUrl2")

    room.setStatusUser(StatusUser.MUTED, 1)

    println(room.users.joinToString())
}