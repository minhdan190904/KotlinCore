fun main() {
    try {
        val name: String? = null
        print(name!!.length) // Gây lỗi NullPointerException nếu name là null
    }catch (e : Exception){
        println("Error ${e.message}")
    }
}