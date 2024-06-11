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

internal class Room(
    val cover: String,
    val name: String,
    val users: MutableList<User>,
) {
    fun addUser(user: User) {
        users.add(user)
    }

    fun setStatusUser(status: StatusUser, nickName: String) {
        val userEdit = users.first { user ->
            user.nickName == nickName
        }
        users[users.indexOf(userEdit)].status = status
    }
}

internal data class User(
    // какая то ссылка на аватарку пользователя
    val avatarUrl: String,
    val nickName: String,
    var status: StatusUser = StatusUser.MUTED,
)

internal enum class StatusUser(val description: String) {
    TALKS("разговаривает"),
    MICROPHONE_IS_OFF("микрофон выключен"),
    MUTED("пользователь заглушен");

}

internal fun main() {
    val room = Room(
        cover = "cover",
        name = "name",
        users = mutableListOf(
            User(
                avatarUrl = "avatarUrl",
                nickName = "nickname",
                status = StatusUser.TALKS,
            ),
            User(
                avatarUrl = "avatarUrl1",
                nickName = "nickname1",
            )
        )
    )

    println(room.users)

    room.addUser(User(avatarUrl = "avatarUrl2", nickName = "nickname2"))

    room.setStatusUser(StatusUser.MUTED, "nickname")

    println(room.users)
}