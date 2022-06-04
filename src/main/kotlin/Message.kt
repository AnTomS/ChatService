data class Message (
    val id : MessageId,
    val text : String,
    val authorId: UserId
) {
    var isRead: Boolean = false
}

