// Giao diện generic chỉ cho phép đọc các phần tử của loại T
interface Producer<out T> {
    fun produce(): T
}

class StringProducer : Producer<String> {
    override fun produce(): String {
        return "Hello, Kotlin"
    }
}

fun main() {
    val stringProducer: Producer<String> = StringProducer()

    // Producer<out T> có thể được gán cho Producer<Any> vì T là kiểu con của Any
    val anyProducer: Producer<Any> = stringProducer

    println(anyProducer.produce())  // Kết quả: Hello, Kotlin
}
