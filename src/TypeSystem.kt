fun main() {
    // Subtype and Supertype Example
    val intNumber: Int = 42
    val doubleNumber: Double = 3.14
    val genericNumber: Number = intNumber // Int (subtype) assigned to Number (supertype)
    println("Generic Number: $genericNumber")

    // Root type Any
    val message: Any = "Hello, Kotlin" // String is a subtype of Any
    val isCool: Any = true // Boolean is a subtype of Any
    val number: Any = 100 // Int is a subtype of Any
    println("Message as Any: $message")
    println("Boolean as Any: $isCool")
    println("Number as Any: $number")

    // Root type Any? (Nullable Example)
    val nullableString: String? = null
    val nullableAny: Any? = nullableString // Nullable String is a subtype of Any?
    println("Nullable Any: $nullableAny")

    // Safe Call Operator (?.) with Any?
    val length = nullableString?.length ?: 0 // Elvis operator for default value
    println("Length of nullable string: $length")

    // Type Checking Example
    fun calculate(number: Number) {
        println("Number is: $number")
    }
    calculate(intNumber) // Int (subtype) can be passed to a function expecting Number (supertype)

    // Unit Example
    fun logMessage(): Unit {
        println("Logging a message...")
    }
    val unitResult: Unit = logMessage() // Unit function returning Unit type
    println("Unit result: $unitResult") // Unit is represented as "kotlin.Unit"

    // Nothing Example
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }
    try {
        fail("This is an intentional failure")
    } catch (e: Exception) {
        println("Caught exception: ${e.message}")
    }

    // Type Hierarchy Demonstration
    val nullableNumber: Number? = null
    val nonNullableNumber: Number = 123
    val anyType: Any = nonNullableNumber // Non-nullable Number is subtype of Any
    val anyNullableType: Any? = nullableNumber // Nullable Number is subtype of Any?
    println("Any type: $anyType")
    println("Any? type: $anyNullableType")
}
