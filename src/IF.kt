fun main() {
    val a = 1
    val b = 2
    val c : Int = if(a > b){
        println(a)
        a
    }
    else{
        println(b)
        b
    }
    println("Win is $c")
    val max = if (a > b) a else b

    val number = 5

    when (number) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        else -> println("Number is greater than four")
    }

    val message = when (number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        else -> "Number is greater than four"
    }

    println(message) // Output: Three


    when {
        number < 0 -> println("Negative number")
        number in 1..10 -> println("Number between 1 and 10")
        number % 2 == 0 -> println("Even number")
        else -> println("Odd number greater than 10")
    }


}