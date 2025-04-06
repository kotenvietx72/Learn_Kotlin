package Lab02

// Delegation và thuộc tính delegation (Chưa học xong)

interface Base {
    fun sayHello()
}

class BaseImpl(private val name: String) : Base {
    override fun sayHello() { println("Hello, $name") }
}

// Tạo lớp khác ủy quyền gọi phần thân, nếu override lại thì gọi hàm đã override lại
class Derived(b: Base) : Base by b

fun main() {
    val b = BaseImpl("Vanh")
    val other = BaseImpl("Nguyen")

    Derived(b).sayHello()
}