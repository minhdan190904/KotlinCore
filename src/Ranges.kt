fun main() {
    val a = 1
    val b = 2
    val c = 3
    var checked = a > b && c < b
    println(checked)
    checked = b in a..c
    println(checked)
}