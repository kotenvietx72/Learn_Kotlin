package Lab02

import java.text.DecimalFormat
import javax.print.attribute.standard.PrinterInfo

fun main() {
    print("Nhập chuỗi: ")           // In chuỗi
    val input: String = readln()    // Nhập thông tin một chuỗi
    println("Input : $input")
    println(input.uppercase())        // In hoa chuỗi vừa nhập
    println(input.lowercase())        // In thường chuỗi vừa nhập

    var sum: Int = 0    // var: có thể gán lại nhiều lần
    val a = 10          // val: Chỉ có thể gán 1 lần
    val b = 20
    sum = a + b

    val sum1 = addTwoNumbers(a, b)
    println(sum1)

    val sum2 = add(1f, 2f, 3f)
    val format = DecimalFormat("0.##")
    println(format.format(sum2))

    var Account = BankAccount("Hi", 12354L)
    Account.PrinterInfo()
}

fun addTwoNumbers(a: Int, b: Int): Int {            // Kiểu hàm thông thường
    return a + b
}

fun add(a: Float, b: Float, c: Float) = a + b + c   // Hàm ngắn gọn

class BankAccount(private var accountNumber: String, private var balance: Long) {
    fun PrinterInfo(){
        println("$accountNumber, $balance")
    }
}