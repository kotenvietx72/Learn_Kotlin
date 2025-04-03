package Lab02

// Lớp Shape cho lớp khác kế thừa, thêm từ khóa open
open class Shape (x: Int, y: Int) {

}

// Lớp Circle kế thừa lớp Shape
class Circle(x: Int, y: Int, radius: Float) : Shape(x, y) {

}

// Lớp trừu tượng
abstract class Shape2D(protected val x: Int,protected val y: Int) {
    abstract fun calculateArea(): Float
    abstract fun draw()
}

class Rectangle2D(x: Int, y: Int,private val width: Float,private val height: Float) : Shape2D(x, y) {

    // Override lại các hàm của lớp trừu tượng
    override fun calculateArea(): Float {
        return 2f
    }

    override fun draw() {
        println("Drawing rectangle...")
    }
}

fun main() {
    val a = Rectangle2D(1, 2, 3f, 4f)
}