package Lab02

import kotlin.math.sqrt

fun main() {
    val obj = "Hello Kotlin"
    val number = 100
    CheckStringType(obj)
    CheckStringType(number)

    var number1 = 100
    var sqrtnmber1: Int? = sqrt(number1.toDouble()) as Int? // Ép kiểu không an toàn => Không ép được sinh ra ngoại lệ, tránh ngoại lệ thêm dấu ?
    var sqrtnumber2 = sqrt(number1.toDouble()).toInt()      // Ép kiểu an toàn
}

fun CheckStringType(obj: Any){              // Kiểm tra 1 biến có phải kiểu đã cho hay không
    if(obj is String)
        println("Đối tượng có kiểu String")
    else
        println("Đối tượng không phải kiểu String")
}

fun isNullOrEmpty(obj: Any){
    // Kiểm tra đúng là kiểu dữ liệu thì tự ép kiểu => Ép kiểu thông minh
    if(obj !is String || obj.length == 0) {         // Nếu obj không phải string thì điều kiện trong if đúng, vế sau không cần xét nữa
    }
//    if(obj is String || obj.length == 0){         Nếu obj không phải string thì sẽ chuyển sang vế thứ hai, mà về thứ 2 yêu cầu là string thì mới xét được, nên sẽ có lỗi
//    }
    if(obj is String && obj.length == 0) {         // obj là string và có thể gọi hàm length
    }
}

fun doPrint(obj: Any){
    // Ví dụ khác về ép kiểu thông minh, ngắn gọn và dễ sử dụng
    when(obj){
        is Int -> println(obj + 100)
        is String -> println(obj.length)
        is IntArray -> println(obj.sum())
    }
}