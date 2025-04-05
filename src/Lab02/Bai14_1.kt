package Lab02

// Tìm hiểu interface

open class Shape4(protected val x: Int, protected val y: Int) {
    open fun showInfo() {
        println("X = $x, Y = $y")
    }
}

interface Drawable {
    val lineStyle: String
    val lineColor: String

    fun draw()

    fun ringBell(){
        println("The bell is ringing")
    }
}

// Lớp vừa kế thừa từ lớp khác, vừa triển khai interface
class Rectangle5(x: Int, y: Int, private val width: Int, private val height: Int) : Shape4(x, y), Drawable {
    // override lại các thuộc tính
    override val lineStyle: String
        get() = "Solid"
    override val lineColor: String
        get() = "Blue"

    // Các phương thức đã có phần thân k cần override
    override fun draw() {
        println("Drawing a rectangle, width: $width, height: $height")
        println("Quá trình vẽ hoàn tất")
        ringBell()
    }

    override fun ringBell() {
        super.ringBell()
        println("Chuông reo")
    }

    override fun showInfo() {
        super.showInfo()
        println("Width = $width, Height = $height")
    }
}

interface DBConnection {
    fun connect(connString: String)
    fun disconnect()
    fun checkConnection()
}

interface Comparable {
    fun compareTo(other: Any, obj: Any): Int
}

// 1 lớp kế thừa từ interface phải override lại các hàm
class DbConnectionImp: DBConnection {
    override fun checkConnection() {

    }

    override fun disconnect() {
        println("Disconnecting")
    }

    override fun connect(connString: String) {
        println("Connecting to $connString")
    }
}