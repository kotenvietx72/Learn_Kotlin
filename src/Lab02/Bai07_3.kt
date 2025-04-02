package Lab02

fun main() {
    val friends = listOf("Hoa", "Lan", "Khang", "Hồng", "Vũ", "Công")

    for(item in friends) {                          // Vòng lặp không quan tâm chỉ số của mảng
        println(item)
    }

    for(values in 0..friends.lastIndex) {      // Vòng lặp quan tâm chỉ số của mảng
        println(friends[values])
    }

    for(index in 1..100 step 2) {              // Vòng lặp in từ 1 đến 100 có bước nhảy là 2
        println(index)                              // Kết quả: 1 3 5 7 9 ......
    }

    for(index in 100 downTo 1 step 3) {        // Vòng lặp in lùi từ 100 về 1 có bước nhảy là 3
        println(index)                              // Kết quả: 100 97 94 91 88 ...
    }

    for((index, name) in friends.withIndex()) {     // Vòng for vừa có cả chỉ số, vừa có cả giá trị
        println("$index: $name")
    }
}

