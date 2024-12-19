fun printInformation(hello : String){
    println(hello)
}

open class Person(name : String, age : Int, id : String){
    constructor() : this("", 0, "")
    var name : String = name
        get() = field
        set(value) {field = value}
    var age : Int = age
        get() = field
        set(value) {field = value}
    var id : String = id
        get() = field
        set(value) {field = value}
    open fun printInfo(func : (String) -> Unit){
        func(name)
        func(age.toString())
        func(id)
    }
}

class Student(name : String, age : Int, id : String, idStudent : String) : Person(name, age, id){
    var idStudent : String = idStudent
        get() = field
        set(value) {field = value}
    override fun printInfo(func : (String) -> Unit){
        super.printInfo(func)
        func(idStudent)
    }
    constructor() : this("", 0, "", "")
}

fun main() {
    val student = Student("Minh Dan", 20, "001204041567", "222631084")
    student.printInfo(::printInformation)
}