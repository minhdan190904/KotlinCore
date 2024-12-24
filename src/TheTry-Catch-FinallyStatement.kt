import java.lang.ArithmeticException

fun countSomething(): Int {
    val divisor = 0 // Giá trị dẫn đến lỗi chia cho 0
    return 100 / divisor // Ném ra ArithmeticException
}

fun test() {
    val result = try {
        countSomething() // Gọi hàm có khả năng ném ngoại lệ
    } catch (e: ArithmeticException) {
        throw Exception("Lỗi khi tính toán", e) // Ném lại ngoại lệ dưới dạng IllegalStateException
    }

    // Sử dụng kết quả (nếu không có ngoại lệ xảy ra)
    println("Kết quả là: $result")
}

fun main() {
    try {
        println("Trong khoi try")
        println(2/0)
    }
    catch(e: ArithmeticException){
        println("Bên trong khối catch")
    }
    finally {
        println("Trong khoi finally")
    }
    println("Ngoai 3 khoi")

    //try catch trong bieu thuc bien
    var number = try{"12".toInt()} catch (e: NumberFormatException){0}
    println(number)

    //add finally
    number= try { "2a".toInt() } catch (e: NumberFormatException) { 0 }
    finally { println("Bên trong khối finally") }
    println(number)

    try {
        test() // Gọi hàm test()
    } catch (e: Exception) {
        println("Đã bắt IllegalStateException: ${e.message}")
        println("Nguyên nhân gốc: ${e.cause}")
    }

}