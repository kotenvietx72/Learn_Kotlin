package Lab02

// Xử lí xung đọt khi ghi đè các thành phần của interface cha

interface BirdMove {
    fun move() {
        println("Bird is moving")
    }
}

interface  CarMove{
    fun move() {
        println("Car is moving")
    }
}

class Superman : BirdMove, CarMove{
    override fun move() {
        println("Person is moving")
        // Gọi các phương thức của lớp cha khi đa kế thừa
        super<BirdMove>.move()
        super<CarMove>.move()
    }
}

fun main() {
    val p = Superman()
    p.move()
}