fun add(vararg list: Int): Int {
    return list.sum()
}

fun main() {
    println(add(12, 213))
    println(add(12, 213, 2, 2313, 55))
}