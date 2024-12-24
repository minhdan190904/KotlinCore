fun calculateSpentMoney(total: Int, itemPrice: Int): Int {
    if (total < 0) {
        throw Exception("Total can't be negative")
    }
    if (itemPrice < 0) {
        throw Exception("Item price can't be negative")
    }
    if (itemPrice == 0) {
        return 0
    }
    val amountToBuy = total / itemPrice
    return amountToBuy * itemPrice
}

fun main() {
    val check : String? = null
    println(check?.length)
    val totalMoney : Int = 100_000
    val itemPrice : Int = -3
    try {
        val each = calculateSpentMoney(itemPrice = itemPrice, total = totalMoney)
        println("Answer is $each")
    }catch (e : Exception){
        println("Erorr is: ${e.message}")
    }
}