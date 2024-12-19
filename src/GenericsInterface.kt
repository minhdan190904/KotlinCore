
interface Storage<T> {
    fun add(item: T)
    fun get(index: Int): T?
    fun size(): Int
}

// Implement lớp Generic
class ListStorage<T> : Storage<T> {
    private val items = mutableListOf<T>()

    override fun add(item: T) {
        items.add(item)
    }

    override fun get(index: Int): T? {
        return if (index in items.indices) items[index] else null
    }

    override fun size(): Int {
        return items.size
    }
}

fun main() {
    // Sử dụng ListStorage với kiểu String
    val stringStorage: Storage<String> = ListStorage()
    stringStorage.add("Hello")
    stringStorage.add("World")

    println("Size of stringStorage: ${stringStorage.size()}")  // Kết quả: 2
    println("First item: ${stringStorage.get(0)}")  // Kết quả: Hello

    // Sử dụng ListStorage với kiểu Int
    val intStorage: Storage<Int> = ListStorage()
    intStorage.add(1)
    intStorage.add(2)

    println("Size of intStorage: ${intStorage.size()}")  // Kết quả: 2
    println("Second item: ${intStorage.get(1)}")  // Kết quả: 2
}
