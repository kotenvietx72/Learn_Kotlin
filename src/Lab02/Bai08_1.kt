package Lab02

fun main() {
    println(add(100, 300))
    println(add(100.5, 300.8))
    println(add())
    val listInt = asList(1,4,6,7,3,2,6,7,8,4,36,7,8)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun add(a: Double, b: Double) = a + b

fun add(a: Int = 0, b: Long = 12L) = a + b

fun asList(vararg numbers: Int): List<Int> {            // Hàm có thể truyền vào n số kiểu Int
    val result = ArrayList<Int>()
    for (number in numbers) {
        result.add(number)
    }
    return result
}