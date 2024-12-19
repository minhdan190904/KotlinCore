interface base{
    fun print(){
        println("Hello")
    }
    fun printHello()
    val a : Int
        get() = 23
}

class con : base{
    override val a : Int = 12
    override fun printHello() {
    }
    var b : Int = 2
}