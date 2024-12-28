import java.util.PriorityQueue

fun main() {
    val n = readLine()!!.toInt()
    val listNumber = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    val mapMutable: MutableMap<Int, Int> = mutableMapOf()
    for(item in listNumber){
        mapMutable[item] = mapMutable.getOrDefault(item, 0) + 1
    }
    val newMap = mapMutable.toSortedMap()
    newMap.forEach { t, u ->
        println("${t} ${u}")
    }
}