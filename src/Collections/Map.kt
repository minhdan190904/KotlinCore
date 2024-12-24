package Collections

fun main() {
    //immutable map
    val students = mapOf(
        "Zhenya" to 5,
        "Vlad" to 4,
        "Nina" to true
    )
    students.forEach {
        println("${it.key} ${it.value}")
    }
    println(students) // output: {Zhenya=5, Vlad=4, Nina=5}

    //build map
    val values = mapOf<String, Int>("Second" to 2, "Third" to 3)
    val map = buildMap<String, Int> {
        put("First", 1)
        putAll(values)
        put("Fourth", 4)
    }
    println(map) // output: {First=1, Second=2, Third=3, Fourth=4}


    //duyet map
    val employees = mapOf(
        "Mike" to 1500,
        "Jim" to 500,
        "Sara" to 1000
    )

    for (employee in employees)
        println("${employee.key} ${employee.value}")

    for ((k, v) in employees)
        println("$k $v")

}