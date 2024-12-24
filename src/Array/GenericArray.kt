package Array

fun main(){

    //using arrayOf by top level function
    val arr1 = arrayOf(1, 2, 3, 4, 5)
    val arr2 = arrayOf("A", "B")
    val arr3 = arrayOf(true, "A", 1)
    for(item in arr3){
        println(item)
    }

    //using constructor of Array<T>
    val arr4 = Array(5) {it + 1}
    for(item in arr4){
        println(item)
    }

    //using arrayOfNulls()
    val arr5 = arrayOfNulls<String>(2)
    println(arr5.joinToString(", "))
    arr5[0] = "Hello"
    arr5[1] = "World"
    println(arr5.joinToString(", "))
}