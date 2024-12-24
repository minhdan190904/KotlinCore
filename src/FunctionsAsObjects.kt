fun getRealGrade(x: Double) = x
fun getGradeWithPenalty(x: Double) = x - 1
fun getScoringFunction(isCheater: Boolean): (Double) -> Double{
    if(isCheater){
        return ::getGradeWithPenalty
    }
    return ::getRealGrade
}

fun isNotDot(c: Char): Boolean = c != '.'

fun main() {
    val scoreExpected: Double = 10.0
    val function = getScoringFunction(isCheater = true)
    val scopeAfterChecked = function(scoreExpected)
    println(scopeAfterChecked)

    //filter of String
    val originalText = "Yon can stop me loving myself.... hey... hey"
    val textWithoutDots = originalText.filter { isNotDot(it) }
    println(textWithoutDots)
}

