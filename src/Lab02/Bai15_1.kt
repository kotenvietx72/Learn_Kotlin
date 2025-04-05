package Lab02

// Các hàm mở rộng, chức năng mở rộng các tính năng mới

// Cú pháp chung của hàm mở rộng
// fun <GenericTypes> ClassName<GenericTypes>.functionName(params): ReturnType {
//     function body
// }

fun String.countWord(): Int {
    val words = this.split(" ") // tách từ tại vị trí có dấu cách
    var counter = 0 // biến đếm số từ
    for (item in words) { // chỉ xét các từ không phải khoảng trắng
        if (item.isNotBlank()) {
            counter++ // nếu từ đang xét không rỗng -> tăng biến đếm lên 1
        }
    }
    return counter // trả về kết quả
}

fun <T> Array<T>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

fun main() {
    val str = "Hello World! This is a string example."
    println("Number of words in the string: ${str.countWord()}")

    val friends = arrayOf("Hưng", "Mạnh", "Nam", "Oanh", "Hà", "Tuấn")

    println("==> Trước khi tráo đổi: ")
    println(friends.contentDeepToString())

    friends.swap(0, 5) // tráo đổi hai phần tử tại vị trí đc chỉ định
    println("==> Sau khi tráo đổi: ")
    println(friends.contentDeepToString())

}


