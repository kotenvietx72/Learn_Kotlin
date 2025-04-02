package Lab02

fun main() {
    var number = arrayOf(1,2,3,4,5)             // Khai báo 1 mảng
    number[0] = 100                             // Set vị trí thứ 0 của mảng thành 100
    val x = number[1]                           // Lấy vị trí thứ 1 trong mảng gán vào x

    for(item in number) {                       // Duyệt các phần tử trong mảng
        println(item)
    }

    for(index in 0..number.lastIndex) {    // Duyệt các phần tử theo chỉ số
        println(number[index])
    }

    val k = 1
    val n = 3
    for(index in k .. n) {                 // Duyệt từ khoảng k tới n
        println(number[index])
    }

    // Tạo mảng của kiểu nguyên thủy
    var interger = intArrayOf(1,2,3,4,5,6,7,8,9,10)                         // Mảng nguyên thủy kiểu Int
    var floats = floatArrayOf(1.00f, 2.00f, 3.00f, 5.00f, 6.00f, 9.00f)     // Mảng nguyên thủy kiểu Float
    val interger100 = IntArray(100)                                    // Tạo mảng trống có 100 phần tử bằng 0
    val interger100_1 = IntArray(100) {-1}                             // Tạo mảng trống có 100 phần tử bằng -1
    val interger20 = IntArray(20) {it * 2}                             // Tạo mảng với chỉ số sau có giá trị gấp đôi chỉ số trước
}