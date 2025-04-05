package Lab02

open class Shape3 {
    open val numberofVertex: Int = 0

    open fun draw() = println("Vẽ hình khối")

    init{
        println("Khởi tạo các thành phần trong lớp Shape")
    }
}

class Triangle2(val edgeA: Float, val edgeB: Float, val edgeC: Float) : Shape3(),Polygon {
    override val numberofVertex = 3
    init {
        println("Khởi tạo các khối thnh phần trong lớp Triangle")
    }

    override fun draw() {
        // Trong trường hợp kế thừa 2 lớp, ta dùng cách sau
        super<Shape3>.draw()

        var filler = Filler()
        filler.drawAndFill()
        print("Drew triangle with edges $edgeA, $edgeB, $edgeC")
    }

    // Tạo 1 class con trong 1 class cha
    inner class Filler {
        fun fill() {
            println("Filling the triangle...")
        }

        fun drawAndFill() {
            fill()
            println("Drawn and filled a triangle")
        }
    }
}

interface Polygon {
    fun draw() {}
}
fun main() {
    val triangle = Triangle2(3f, 4f, 5f)
    triangle.draw()
}