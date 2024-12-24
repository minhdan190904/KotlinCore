fun main() {
    val list = mutableListOf("1", 1, true, false)
    for (index in list.indices){
        println("Element ${index+1}: ${list[index]}")
    }

    val daysOfWeek = mutableListOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")
    for (index in daysOfWeek.lastIndex downTo 0 step 2) {
        println("$index: ${daysOfWeek[index]}")
    }
}