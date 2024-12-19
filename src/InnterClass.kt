class Outer {
    private var _message : String = "Unknown"
    var message : String
        get() = _message
        set(value) {
            _message = when (value) {
                "" -> "Unknown"
                else -> value
            }
        }
    inner class InnerClass{
        fun printMessenger(){
            println("Hello $message")
        }
    }
}

fun main() {
    val a = Outer()
    a.message = "Dan"
    val c  = a.InnerClass()
    c.printMessenger()
}