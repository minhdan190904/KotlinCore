package Array


fun main() {
    //using primitive array by top level function
    val intArr = intArrayOf(1, 3, 2, 4, 2)
    val charArr = charArrayOf()

    //using constructor TypeData + Array
    val doubleArr = DoubleArray(3) {it -> it * 2.5}
    println(doubleArr.joinToString(" "))

    //some method important of Array
    println(intArr.get(1)) // get
    intArr.set(1, 22) // set
    println(intArr.get(1)) // output = 22
    println(intArr.size) // size
    if(!intArr.isEmpty()) println("Mang int ko rong") // isEmpty

    println("First of IntArray: " + intArr.first()) // first
    println("Last of IntArray: " + intArr.last()) // last

    println("First of CharArray: " + charArr.firstOrNull()) // firstOrNull
    println("Last of CharArray: " + charArr.lastOrNull()) // lastOrNull

    val value1: Int = 2
    println("First position of value ${value1} in IntArray is: ${intArr.indexOf(value1)}") //indexOf
    println("Last position of value ${value1} in IntArray is: ${intArr.lastIndexOf(value1)}") //lastIndexOf
    println("First position in IntArray that divisible by 2: ${intArr.indexOfFirst{it % 2 == 0}}") //indexOfFirst

    if(intArr.contains(1)) println("IntArray contains 1") // contains

    println(intArr.count()) // count
    println("Number of item that not divisible by 2 is: ${intArr.count { it % 2 == 1}}")

    println("Sum of all item in IntArray is: ${intArr.sum()}") // sum
    println("Average of all item in IntArray is: ${intArr.average()}") // average
    println("Max value of all item in IntArray is: ${intArr.maxOrNull()}") // maxOrNull
    println("Min value of all item in IntArray is: ${intArr.minOrNull()}") // minOrNull

    //using forEach
    intArr.forEach {
        number ->
        println("Number: ${number}")
    }

    intArr.forEach {
        println("Number: ${it}")
    }

    //using forEachIndexed
    intArr.forEachIndexed { index, value ->
        if(index % 2 == 0) println(value)
    }

    //using map
    val newIntArr = intArr.map{it * 2}
    newIntArr.forEach {
            number ->
        println("Number: ${number}")
    }

    //using filter
    val newIntArr2 = intArr.filter{it % 2 == 0}
    newIntArr2.forEach {
            number ->
        println("Number: ${number}")
    }

    //using sort
    intArr.sort() // in contrast with sortDescending()
    for(item in intArr){
        print("${item} ")
    }
    println()

    //plus
    val arr1 = intArrayOf(1, 2, 3)
    val arr2 = intArrayOf(4, 5, 6)
    val combined = arr1.plus(arr2)   // [1, 2, 3, 4, 5, 6]
    for(item in combined){
        print("${item} ")
    }
    println()

    //copyOf
    val root = intArrayOf(11, -2, 2, 42, 3)
    val copyArray = root.copyOf()
//    val copyArray = root : khong nen dung vi no tham chieu den root
    for(item in copyArray){
        print("${item} ")
    }
    println()

    //copyOfRange(start, end)
    val root1 = intArrayOf(11, -2, 2, 42, 3)
    val copyArray1 = root1.copyOfRange(0, 3)
//    val copyArray1 = root1 : khong nen dung vi no tham chieu den root1
    for(item in copyArray1){
        print("${item} ")
    }

    //reverse
    intArr.reverse()
    for(item in intArr){
        print("${item} ")
    }
    println()

    //fill
    intArr.fill(4, 1, 4)
    for(item in intArr){
        print("${item} ")
    }
    println()
}