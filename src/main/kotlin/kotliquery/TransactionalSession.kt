package kotliquery

class TransactionalSession(
        override val connection: Connection,
        override val returnGeneratedKeys: Boolean = false,
        override val autoGeneratedKeys: List<String> = listOf()) : Session(connection, returnGeneratedKeys, autoGeneratedKeys) {

}