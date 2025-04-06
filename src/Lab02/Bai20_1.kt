package Lab02

// Kotlin generics: Định nghĩa một công thức chung, dùng cho mọi kiểu dữ liệu nếu cần

class Pair<K, V>(val key: K, val value: V) {
    override fun toString(): String = "($key, $value)"
}

// Gán biến generic kiểu con cho biến generic kiểu cha, khi định nghĩa bổ sung từ khóa out
interface Source<out T> {
    fun next(): T
}

fun demo(strs: Source<String>) {
    val objects: Source<Any> = strs
}

// Nếu gán ngược lại ta dùng từ khóa in
interface Comparable1<in T> {
    operator fun compareTo(other: T): Int
}

fun demo1(x: Comparable1<Number>) {
    x.compareTo(1.0)
    val y: Comparable1<Double> = x
}

fun main() {
    val one = Pair(1, "one")
    val hello = Pair("Hello", "Xin chào")
    val love = Pair("Love", "Tình yêu")

    println(one)
    println(hello)
    println(love)

}