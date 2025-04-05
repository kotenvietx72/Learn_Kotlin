package Lab02

const val MAX_NUMBER_STUDENTS = 25
const val PI: Float = 3.14159265358979323846f

class Student3{
    private val studentId: String
        get() = field                                   // Thuộc tính val chỉ có thể get = field (tham số mặc định)
                                                        // Get Set trong trường hợp này không có ý nghĩa
    private lateinit var FullNameBacking: String        // Biến phụ của fullName, dùng để xử lí ở trong hàm mà k cần gọi FullName, tránh lặp vô hạn
    var FullName: String
        get() = FullNameBacking
        set(value) {
            FullNameBacking = value
        }
    private var year: Int
    private var GPA: Float

    constructor(studentId: String = "", FullName: String = "", year: Int = 0, GPA: Float = 0f){
        this.studentId = studentId
        this.FullName = FullName
        this.year = year
        this.GPA = GPA
    }
}

class Rectangle4(val width: Int, val height: Int) {
    val area: Int
        get() = this.width * this.height        // Getter gắn với giá trị khác thì mới có ý nghĩa
    val perimeter: Int
        get() = 2 * (this.width + this.height)
}

fun main() {
    val student = Student3("A123456", "Việt Anh", 1, 3.8f)
    val rec = Rectangle4(10, 5)
    println("Area of rectangle is ${rec.area} and perimeter is ${rec.perimeter}")
}