package Collections

// *** Tổng hợp về Set trong Kotlin ***

fun main() {
    // *** Set là gì? ***
    // Set là một bộ sưu tập không có thứ tự, không cho phép trùng lặp, và bất biến.

    // *** Khởi tạo Set ***
    val immutableSet = setOf("A", "B", "C", "C") // Không cho phép trùng lặp
    println(immutableSet) // Output: [A, B, C]

    val emptySet = emptySet<Int>() // Khởi tạo Set rỗng
    println(emptySet) // Output: []

    val buildSet = buildSet {
        add("D")
        addAll(immutableSet)
    }
    println(buildSet) // Output: [D, A, B, C]

    // *** Thuộc tính và phương thức của Set ***
    val visitors = setOf("Andrew", "Mike", "Sarah")

    // Kiểm tra kích thước và rỗng
    println("Kích thước Set: ${visitors.size}") // Output: 3
    println("Set có rỗng không? ${visitors.isEmpty()}") // Output: false

    // Kiểm tra tồn tại phần tử
    println("Mike có trong Set không? ${visitors.contains("Mike")}") // Output: true

    // Lấy phần tử đầu và cuối (không đảm bảo thứ tự)
    println("Phần tử đầu: ${visitors.first()}") // Output: Andrew (hoặc phần tử khác)
    println("Phần tử cuối: ${visitors.last()}") // Output: Sarah (hoặc phần tử khác)

    // Chuyển Set thành chuỗi
    println("Set dưới dạng chuỗi: ${visitors.joinToString()}") // Output: Andrew, Mike, Sarah

    // Kiểm tra tập con
    val studentsGroup = setOf("Bob", "Larry", "Vlad")
    val studentsInClass = setOf("Vlad")
    println("Tất cả sinh viên có trong lớp không? ${studentsInClass.containsAll(studentsGroup)}") // Output: false

    // Cộng và trừ hai Set
    val products1 = setOf("Apple", "Banana")
    val products2 = setOf("Banana", "Cherry")

    val combinedProducts = products1 + products2 // Cộng Set
    println("Cộng Set: $combinedProducts") // Output: [Apple, Banana, Cherry]

    val subtractedProducts = products1 - products2 // Trừ Set
    println("Trừ Set: $subtractedProducts") // Output: [Apple]

    // Chuyển MutableList thành Set
    val groceries = mutableListOf("Pen", "Apple", "Pen", "Pineapple")
    println("Set từ MutableList: ${groceries.toSet()}") // Output: [Pen, Apple, Pineapple]

    // *** Duyệt qua Set ***
    val guests = setOf("Alice", "Bob", "Charlie")
    for (guest in guests) {
        println("Hello $guest!")
    }
    // Output:
    // Hello Alice!
    // Hello Bob!
    // Hello Charlie!
}
