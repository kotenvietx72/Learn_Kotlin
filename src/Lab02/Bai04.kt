package Lab02

fun main() {
    // Kiểu dữ liệu String
    val s:String = "Hello World"
    for(c in s) {                   // Vì String là một dãy kí tự kiểu Char nên có thể in ra như này
        println(c)
        println(c.uppercase())      // In hoa toàn bộ kí tự
        println(c.lowercase())      // In thường toàn bộ kí tự
    }

    println(s === s.uppercase())    // So sánh hai chuỗi kí tự, có thể == hoặc ===
    // Nối chuỗi
    var str1:String = "Chào"
    var str2:String = "Cậu"
    val age1 = 21

    println(str1 + " " + str2)
    println(str2 + " " + age1)       // Để kiểu String ở đầu, các kiểu dữ liệu số khác phải ở sau

    val FullName = "Nguyễn Việt Anh"
    val age = 20
    println("Họ và tên: $FullName, Tuổi: $age")

    val a = 10
    val b = 20
    println("$a + $b = ${a + b}")
}