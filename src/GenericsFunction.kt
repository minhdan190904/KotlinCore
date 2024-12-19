fun <T,T1> printItem(item: T, cao : T1) {
    println(item)
}

fun main() {
    printItem(42, 23)  // Kết quả: 42
    printItem("Kotlin", 23)  // Kết quả: Kotlin
}
