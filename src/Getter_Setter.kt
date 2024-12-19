class HCN(private var _a : Int, private  var _b : Int){
    var a : Int
        get() = if(_a > 0) _a else 0
        set(value) {_a = if(value > 0) value else 0}
    var b : Int
        get() = if(_b > 0) _b else 0
        set(value) {_b = if(value > 0) value else 0}
    val area : Int
        get() = a * b
}

fun main() {
    val area1 = HCN(-1,5).area
    println(area1)
    val area2 = HCN(22,5).area
    println(area2)
}