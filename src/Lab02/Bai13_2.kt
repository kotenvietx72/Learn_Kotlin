package Lab02

// Các thuộc tính khởi tạo muộn, cho phép các thuộc tính có thể khởi tạo sau

class Student4{
    private lateinit var studentID: String          // Áp dụng cho var và các kiểu tham chiếu, không áp dụng cho các kiểu nguyên thủy (Int, Float, Double)
    private var age: Int = 0

    constructor(studentID: String, age: Int){
        this.studentID = studentID
        this.age = age
    }
}