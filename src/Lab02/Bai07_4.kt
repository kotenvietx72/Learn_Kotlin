package Lab02

fun main() {
    val number = 1234567
    println(SumNDigits(number))
}

fun SumNDigits(Number: Int): Int{           // Vòng lặp while
    var sum = 0
    var n = Number
    while(n > 0){
        sum += n % 10
        n /= 10
    }
    return sum
}

fun SumDigits1(Number: Int): Int{           // Vòng lặp Do - While
    var sum = 0
    var n = Number
    do {
        sum += n % 10
        n /= 10
    } while(n > 0)
    return sum
}