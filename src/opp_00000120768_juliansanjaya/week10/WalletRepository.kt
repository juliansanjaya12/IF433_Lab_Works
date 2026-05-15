package opp_00000120768_juliansanjaya.week10

interface HasName {
    val name: String
}

class WalletRepository<T : Any> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(name: String): List<T> {
        return items.filter {
            it is HasName && it.name == name
        }
    }
}