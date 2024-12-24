import java.util.Scanner

fun scanner1(){
    val scanner = Scanner("123_456")
    scanner.useDelimiter("_")
    println(scanner.nextInt())
    println(scanner.nextInt())
}

fun scanner2(){
    val scanner = Scanner(System.`in`)
    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    println(number1)
    println(number2)
}

fun scanner3(){
    val scanner = Scanner("Kenshi Yonezu is Hachi")
    while (scanner.hasNext()){
        println(scanner.next())
    }
}


fun main() {
//    scanner1()
//    scanner2()
    scanner3()
}