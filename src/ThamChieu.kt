class MinhDan(var ok1: String) {
    val ok: Int
        get() {
            TODO()
        }

    fun getOK1() = ok1
    fun updateValue(valueUpdate: String) {
        ok1 = valueUpdate.toString()
    }
}

fun main() {
    var msg1 = MinhDan("232")
    var msg2 = msg1

    msg1.updateValue("1213123") // update luon cho ca cai msg2 vi cung tro vao 1 doi tuong
    println(msg2.getOK1())
}