package Lab02

fun main() {
    val b = 5                           // biến tự hiểu kiểu dữ liệu là Int
    val c = 5L                          // Ép kiểu biến c là 1 giá trị kiểu Long
    val x = 5_000000000000000            // biến tự hiểu kiểu dữ liệu là Long
    val number:Long = 12345667346       // Để kiểu Long cho biến number

    // Các kiểu số nguyên: Byte, Short, Int, Long
    // Các kiểu số thực: Float, Double

    val d:Float = 3.14F                 // Khai báo bến kiểu Float, độ chính xác tối đa 6 chữ số
    val e = 3.14                        // Tự hiểu kiểu Double, độ chính xác tối đa 16 chữ số

    // Các kiểu số nguyên dương, lưu trữ được nhiều hơn gấp đôi: UByte, UShort, UInt, ULong
    val f = 5u                          // Tự hiểu theo kiểu UInt
    val g = 4uL                         // Tự hiểu theo kiểu ULong
    val h = 0xFFFF                      // Gán giá trị hệ 16 sang hệ 10
    val i = 0b1101010101_1010101        // Gán giá trị hệ 2 sang hệ 10, phải có tiền tố 0b ở trước, có thể phân tách thành các cặp số

    // Các kiểu kí tự
    val char: Char = 'a'                // Kiểu char lưu trữ 1 kí tự duy nhất
    println('\u21FE')                   // In ra mũi tên 2 chiều, kiểu kí tự đặc biệt theo kiểu UNICODE, thêm tiền tố \u ở trước
    val isPrime: Boolean = true

    // Phép toán giữa các kiểu khác nhau, kết quả theo kiểu dữ liệu lớn hơn
    var k: Int = 1
    val l:Long = 1
    val sum = k + l
    // Nếu kết quả là NaN: Not a Number (Không có số)
    val m: Int = 5
    m.toString()                        // Ép kiểu Int sang kiểu String
}