package Lab02

class UniversityStudent(
    private var fullName: String,
    private var address: String,
    private var gpa: Float
) {
    override fun toString(): String {
        return "$fullName - $address - $gpa"
    }

    fun doExam(subject: String) {
        println("Sinh viên $fullName đang làm bài kiểm tra môn $subject")
    }

    // Có thể gọi các thuộc tính của đối tượng companion
    fun doSomeThing()  {
        val x = something
    }

    // Đối tượng companion: Dùng để chia sẻ chung cho lớp chứa nó hoặc các lớp bên ngoài, có thể triển khai interface
    companion object Factory {

        private val something = 500

        var numOfStudent: Int = 0
            private set

        fun create(fullName: String, address: String, gpa: Float): UniversityStudent {
            numOfStudent++
            return UniversityStudent(fullName, address, gpa)
        }
    }
}

fun main() {
    val studentA =
        UniversityStudent.create("Phạm Thanh Hoa", "Hà Nội", 3.25f)
    val studentB =
        UniversityStudent.create("Lưu Thị Hoa", "Hồ Chí Minh", 3.28f)
    val studentC =
        UniversityStudent.create("Đỗ Quỳnh Nga", "Đà Nẵng", 3.45f)
    val studentD =
        UniversityStudent.create("Lưu Linh Đan", "Nghệ An", 3.57f)
    val studentE =
        UniversityStudent.create("Lê Công Tuấn", "Quảng Nam", 3.87f)

    println("Số lượng sinh viên đã tạo: ${UniversityStudent.numOfStudent}")
}