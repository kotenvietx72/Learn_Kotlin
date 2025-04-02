package Lab02

fun main() {
    PrintMonthName(2)
    printSeason(Season.SPRING)
    PrintSeason(9)
}

fun PrintMonthName(month: Int) {
    when(month){
        1 -> println("Tháng Một")
        2 -> println("Tháng Hai")
        3 -> println("Tháng Ba")
        4 -> println("Tháng Bốn")
        5 -> println("Tháng Năm")
        6 -> println("Tháng Sáu")
        else -> println("Không phải tháng trong năm")
    }
}

enum class Season{                  // Enum class
    SPRING, SUMMER, FALL, WINTER
}

fun printSeason(season: Season){
    when(season){
        Season.SPRING -> println("Spring")
        Season.SUMMER -> println("Summer")
        Season.FALL -> println("Fall")
        Season.WINTER -> println("Winter")
    }
}

fun DoSomeThing(number: Int?): String? {
    return when(number){        // Phải có else vì có thể nhận giá trị null
        0 -> "Zero"
        1 -> "One"
        2 -> "Two"
        else -> null
    }
}

fun PrintSeason(month: Int){
    when(month){
        1,2,3 -> println("Spring")
        4,5,6 -> println("Summer")
        7,8,9 -> println("Fall")
        10,11,12 -> println("Winter")
        else -> println("Unknown")
    }
}

fun printSeason2(month: Int) {
    when (month) {
        in 1..3 -> println("Mùa Xuân")
        in 4..6 -> println("Mùa Hạ")
        in 7..9 -> println("Mùa Thu")
        in 10..12 -> println("Mùa Đông")
        else -> println("Tháng Không Hợp Lệ")
    }
}