package Lab02

// Ghi đè các phương thức và thuộc tính
open class Shape2 {
    open val vertexCount: Int = 0
    open lateinit var color: String

    open fun draw() {
        println("Vẽ hình khối")
    }
    // Không có từ khoá open thì các lớp con không thể override lại
    fun fill() {
        println("Tô màu cho hình khối")
    }
}

class Triangle(val edge1: Double, val edge2: Double, val edge3: Double) : Shape2() {
    override val vertexCount: Int
        get() = 3

    // Get set trong Kotlin
    override var color: String
        get() = "RED"
        set(value) {
                //
            }

    override fun draw() {
        println("Vẽ hình tam giác")
    }
}

open class Rectangle2(var width: Double, var height: Double) : Shape2() {
    // Override lại các thuộc tính
    override val vertexCount: Int
        get() = 4
    override fun draw() {
        println("Vẽ hình chữ nhật với chiều dài là $width và chiều rộng là $height")
    }
}

class ColorRectangle(width: Double, height: Double) : Rectangle2(width, height) {
    override fun draw() {
        super.draw()
        println("Vẽ màu cho hình")
    }
}