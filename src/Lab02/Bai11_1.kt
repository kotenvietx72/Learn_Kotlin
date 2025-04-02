package Lab02

import java.util.*

class BankAccount1 {
    // Các thuộc tính
    val accNumber: String = ""
    val balance: Long = 0
    val bank: String = ""
    val startDate: Date = Date()

    // Các hàm của đối tượng
    fun lockAcc() {}
    fun CheckBalance() {}
    fun withdraw() {}
    fun bankTransfer(other: BankAccount) {}

}

// Khai báo kiểu ngắn gọn
class Student (private val StudentId: String, private val FullName: String, private val GPA: Float) {

    fun doExam(subject: String) {
        println("Sinh viên $FullName đang làm bài kiểm tra môn $subject ")
    }
}

// Tương tự với trên
class Student1 (StudentId: String, FullName: String, GPA: Float) {
    // private lateinit var StudentId: String   (lateinit: Chưa cần gán vội) (Kiểu nguyên thủy yêu cầu phải gán)
    private var StudentId: String
    private var FullName: String
    private var GPA: Float

    // Hàm khởi tạo thứ cấp


    // Khối khởi tạo
    init {
        this.StudentId = StudentId
        this.FullName = FullName
        this.GPA = GPA
    }

    fun doExam(subject: String) {
        println("Sinh viên $FullName đang làm bài kiểm tra môn $subject ")
    }
}

//Hàm khởi tạo thứ cấp
class Student2 () {
    private lateinit var StudentId: String
    private lateinit var FullName: String
    private var GPA: Float = 0f

    // Khối khởi tạo thứ cấp
    constructor(StudentId: String, FullName: String, GPA: Float) : this() {
        this.StudentId = StudentId
        this.FullName = FullName
        this.GPA = GPA
    }

    fun doExam(subject: String) {
        println("Sinh viên $FullName đang làm bài kiểm tra môn $subject ")
    }
}

fun main() {
    val HS1 = Student("A1", "Việt Anh", 3.8f)
    val HS2 = Student1("A2", "Huy Trần", 3.4f)
    HS1.doExam("Toán")
    HS2.doExam("Tiếng Anh")
}