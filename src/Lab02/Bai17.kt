package Lab02

// Nested class: Class con ở bên trong class cha

class Outer{
    private val x = 1210


    // inner class: Có thể truy cập vào thành phần của class cha
    inner class Nested {
        val somevalue: Int
            get() = 500
    }
}

interface  Calculator{
    fun add(a: Int, b: Int): Int
    fun sub(a: Int, b: Int): Int
    fun mul(a: Int, b: Int): Int
    fun div(a: Int, b: Int): Int
}

fun main() {
    // Tạo đối tượng lớp con
    val nestedObj = Outer().Nested()

    // Tạo lớp inner vô danh, dùng khi cần tạo 1 đối tượng sử dụng ngay trong 1 hàm nào đó, k cần khởi tạo mới các lớp
    val myCalculator = object: Calculator{
        override fun add(a: Int, b: Int): Int {
            return a + b
        }

        override fun sub(a: Int, b: Int): Int {
            return a - b
        }

        override fun mul(a: Int, b: Int): Int {
            return a * b
        }

        override fun div(a: Int, b: Int): Int {
            return a / b
        }

    }

    println("5 + 10 = ${myCalculator.add(5, 10)}")
}