class OuterClass {
    private var _message : String = "Unknown"
    var message : String
        get() = _message
        set(value) {
            _message = when (value) {
                "" -> "Unknown"
                else -> value
            }
        }
    class NestedClass{
        fun printMessenger(){
            println("Hello World!")
        }
    }
}

fun main() {
    val a : OuterClass = OuterClass()
    println(a.message)
    val c  = OuterClass.NestedClass()
    c.printMessenger()
}