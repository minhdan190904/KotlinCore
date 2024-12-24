package Collections

fun main() {
    //mutable list
    val list = mutableListOf("A", "B", "C")
    println(list.joinToString(""))        // A, B, C
    println(list.joinToString(" -> ")) // A -> B -> C
    val list1 = mutableListOf("A", "B")
    val list2 = mutableListOf("C", "D")

    val newList = (list1 + list2).toMutableList()
    println(newList.joinToString()) // A, B, C, D
    newList.remove("B")
    newList.removeAt(0)
    println(newList)

    //immutable list
    val listNoChanged = listOf("1", 1, false, 2, 4)
    println(listNoChanged)
    println(listNoChanged.size)
    println(listNoChanged.filter { it is Int })

    //build List
    val names = listOf<String>("Emma", "Kim")
    val allOfList = buildList{
        add("hello")
        addAll(names)
    }
    println(allOfList)
}