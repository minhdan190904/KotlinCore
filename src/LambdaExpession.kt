val mul1 = fun(a: Int, b: Int): Int {
    return a * b
}

val mul2 = {a: Int, b:Int -> a * b}

fun _isNotDot(c: Char): Boolean = c != '.'

fun main() {
    println(mul1(2, 4))
    println(mul2(2, 4))

    val originalText = "I don't know... what to say..."
    var textWithoutDots = originalText.filter { _isNotDot(it) }
    println(textWithoutDots)
    textWithoutDots = originalText.filter { c: Char -> c != '.' }
    println(textWithoutDots)

    listOf(1, 2, 3, 4).forEach { 
        if(it == 3) return@forEach
        println(it)
    }
}