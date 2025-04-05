package Lab02

fun Any?.toString() : String {
    return this?.toString() ?: "null"
}

val <T> Array<T>.middleIndex: Int
    get() = size / 2

fun main() {
    val x = null
    println(x)

    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println("Phần tử chính giữa của mảng: ${numbers[numbers.middleIndex]}")
}