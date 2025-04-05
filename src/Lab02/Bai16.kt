package Lab02

// Lớp data: Chỉ chứa dữ liệu Data

data class Student6(val id: Int, val name: String, val age: Int, val gpa: Float) {

}

// Lớp sealed: Giới hạn lớp con trong cùng module mới kế thừa được
sealed class Father1{

}

fun main() {
    val s1 = Student6(1, "Vanh", 15, 3.8f)

    // Hàm copy các thuộc tính ở primary constructor, có thể thay đổi các giá trị khác
    val otherStudent = s1.copy(id = 2)

    val(x, y) = s1
    println("x = $x, y = $y")
}