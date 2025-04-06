package Lab02

// Biểu thức đối tượng vô danh

interface MouseAdapter {
    fun mouseClick()
    fun mouseEnter()
    fun mouseExit()
    fun mouseRightClick()
}

class ExampleClass {
    // Hàm vô danh ở trong class, phải để kiểu private
    private fun getObject() = object {
        val x: Int = 10
        val y: Int = 20
    }

    // Gọi đến hàm vô danh đã tạo
    fun printObject() {
        val obj = getObject()
        println(obj.x)
        println(obj.y)
    }
}


fun main() {
    val a = object {
        val name = "Anh dep zai"
        val width = 120
        val height = 200

        fun area() = width * height

        fun perimeter() = 2 * (width + height)

        override fun toString(): String = "name: $name, width: $width, height: $height"
    }

    val mouseAdapter = object : MouseAdapter {
        override fun mouseClick() {
            println("I am clicked")
        }

        override fun mouseEnter() {
            println("I am entered")
        }

        override fun mouseExit() {
            println("I am exited")
        }

        override fun mouseRightClick() {
            println("I am right clicked")
        }

    }

    println(a.toString())
}