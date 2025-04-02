package Lab02

fun main() {
    var result = 2001
    println(Check(result))

    var friends = listOf("Vanh", "Hiếu", "Hoàng")
    for(i in friends.indices) {                 // In các phần tử theo chỉ số
        println(friends[i])
    }
    for(friend in friends) {                    // In các phần tử theo từng phần tử
        println(friend)
    }

    var sum = 0
    val n = 100
    for (i in 1..n) {                       // Duyệt các số theo kiểu tường minh
        if (i % 2 == 0) {
            sum += i
        }
    }

    var number = 1
    while (number <= n) {
         if (number % 2 != 0) {
             sum += number
         }
         number++
    }

    // Duyệt ngược từ n về 0 có nhảy 3 đơn vị
    for (x in n downTo 0 step 3) {
        println(x)
    }

    // duyệt tăng từ 1 lên n nhảy 3 đơn vị
    for (x in 1..n step 3) {
        println(x)
    }

    var x: Int? = null // biến x có thể tham chiếu tới null
}

fun Check(number: Int): String {
    return if(number % 2 == 0) "Số chẵn" else "Số lẻ"                   // Hàm if else ngắn gọn
}

fun Check2(number: Int) = if(number % 2 == 0) "Số chẵn" else "Số lẻ"    // Hàm if else ngắn gọn nhất

fun season(month: Int): String = // When giống switch case
    when (month) {
        1, 2, 3 -> "Mùa Xuân"
        4, 5, 6 -> "Mùa Hè"
        7, 8, 9 -> "Mùa Thu"
        10, 11 -> "Mùa Đông"
        12 -> "Mùa Đông"
        else -> "Không xác định"
    }

fun getStringLength(obj: Any): Int? {
    if (obj is String) { // nếu obj là đối tượng kiểu String
        return obj.length // tự ép kiểu sang String và return độ dài String
    }
    return null // nếu obj không phải kiểu String thì return null
}

