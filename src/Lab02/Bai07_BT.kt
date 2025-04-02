package Lab02

fun main() {
    println(BT01(-2))
    println(BT02(-0))
}

fun BT01(number: Int):String = if(number % 2 == 0) "EVEN" else "ODD"

fun BT02(number: Int):String = if(number == 0) "UNSiGNED" else (if(number > 0) "POSITIVE" else "NEGATIVE")
