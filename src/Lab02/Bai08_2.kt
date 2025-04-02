package Lab02

fun main() {
    println(GiaiThua(5, 1))
}

// Đệ quy thường
fun sumDigits(n: Long): Int{
    if(n == 0L)
        return n.toInt()
    else
        return sumDigits(n%10).toInt() + sumDigits(n/10)
}

// Đệ quy đuôi
tailrec fun sumDigits2(n: Long, sum: Int): Int = if(n == 0L) sum else sumDigits2(n / 10, sum + (n % 10).toInt())

tailrec fun GiaiThua(n: Long, kq: Int): Int = if(n == 0L) kq else GiaiThua(n - 1, (kq * n).toInt())