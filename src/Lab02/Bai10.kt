package Lab02

fun main() {
    val x = 20
    println(-x)                     // Toán tử một ngôi
    var p = Point(10, 20)
    println(-p)                     // Phải nạp chồng toán tử -
    println(++p)
    println(--p)
}

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)                 // Toán tử -a

operator fun Point.unaryPlus() = Point(x, y)                    // Toán tử +a

operator fun Point.not(): Point = Point(x+1, y)              // Toán tử !a

operator fun Point.inc(): Point = Point(x + 1, y + 1)     // Toán tử p++ hoặc ++p

operator fun Point.dec(): Point = Point(x - 1, y - 1)     // Toán tử p-- hoặc --p