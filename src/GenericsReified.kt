inline fun <reified T> printType() {
    println(T::class.simpleName)
}

fun main() {
    printType<String>()  // Kết quả: String
    printType<Int>()  // Kết quả: Int
}
