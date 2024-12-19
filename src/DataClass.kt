data class Book(private val title: String, val author: String, val year: Int)

fun main() {
    val book1 = Book("1984", "George Orwell", 1949)
    val book2 = Book("1984", "George Orwell", 1949)
    println(book1)               // Output: Book(title=1984, author=George Orwell, year=1949)
    println(book1.equals(book2))     // Output: true
    println(book1.hashCode())
    val book3 = book1.copy(year = 1950)
    println(book3)               // Output: Book(title=1984, author=George Orwell, year=1950)
}
