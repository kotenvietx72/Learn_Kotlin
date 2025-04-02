package Lab02

fun main() {
    val arr = arrayOf(1,2,3,4,5,6,7,8,9,10)
    // Sử dụng biểu thức lamda
    val sum = DoSomeWork(arr) {s, x -> s + x}
    println("Tổng các phần tử trong mảng: $sum")

    val actionAdd: (Int, Int) -> Int = { a, b -> a + b * b }    // actionAdd sẽ lưu lại giá trị của biểu thức lamda
    val sum2 = DoSomeWork(arr, actionAdd)
    println("Tổng các phần tử bình phương trong mảng: $sum2")

    val a = 20
    val b = 10
    DoSomeThing(a, b, "+" ) { x, y -> x + y }
    DoSomeThing(a, b, "-" ) { x, y -> x - y }
    DoSomeThing(a, b, "*" ) { x, y -> x * y }
    DoSomeThing(a, b, "/" ) { x, y -> x / y }
    DoSomeThing(a, b, "%" ) { x, y -> x % y }
}

// Tạo hàm sử dụng biểu thức lamda
fun DoSomeWork(arr: Array<Int>, action: (s:Int, x:Int) -> Int): Int {
    var sum = 0
    arr.forEach { sum =action(sum, it) }
    return sum
}

/*  Kiểu hàm biểu thức Lamda
*   action(A, B, C) -> D : A, B, C, D là các kiểu thuộc tính
*   A.(B) -> C: A là kiểu dùng để gọi hàm, B là kiểu của tham số và trả về kết quả kiểu C
*
*
*   val sum = {x, y -> x + y}
*  */

fun DoSomeThing(a: Int, b:Int, operator: String, action: (Int, Int) -> Int): Int {
    val result = action(a, b)
    println("$a $operator $b = $result")
    return result
}