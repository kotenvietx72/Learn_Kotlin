package Lab02

// functional interface: Một interface chứa duy nhất 1 phương thức abstract, thường thực hiện chức năng đơn giản (Kiểm tra nút được click, ...)

fun interface GpaValidator{
    fun checkGpa(gpa: Float): Boolean
}

// Sử dụng class để viết hàm
class ValidateGpa: GpaValidator{
    override fun checkGpa(gpa: Float): Boolean {
        return gpa >= 0 && gpa <= 4.0f
    }
}

// Sử dụng biểu thức lamda => Nên viết kiểu này, dễ hiểu, cú pháp ngắn gọn
val validateGpa = GpaValidator { gpa -> gpa >= 0 && gpa <= 4.0f }

fun main() {

}
