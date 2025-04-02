package Lab02

fun main() {
    var p1 = PhanSo(1,2)
    var p2 = PhanSo(2,3)
    var sum = minimize(p1 + p2)            // Nạp chồng toán tử hai ngôi
    println("Phân số khi thực hiện phép cộng là: ${sum.a}/${sum.b}")
}

data class PhanSo(var a:Int, var b:Int)

operator fun PhanSo.plus(other: PhanSo): PhanSo {               // Toán tử p1 + p20
    val lcm = this.b * other.b / gcd(this.b, other.b)
    return PhanSo(this.a * (lcm / this.b) + (lcm / other.b) * other.a, lcm)
}

operator fun PhanSo.minus(other: PhanSo): PhanSo {              // Toán tử p1 - p2
    val lcm = this.b * other.b / gcd(this.b, other.b)
    return PhanSo(this.a * (lcm / this.b) - (lcm / other.b) * other.a, lcm)
}

operator fun PhanSo.times(other: PhanSo): PhanSo {              // Toán tử p1 * p2
    return PhanSo(this.a * other.b, this.b * other.b)
}

operator fun PhanSo.plusAssign(other: PhanSo) {                 // Toán tử p1 += p2
    var lcm = this.b * other.b / gcd(this.b, other.b)
    this.a = this.a * (lcm / this.b) - (lcm / other.b) * other.a
    this.b = lcm
}

fun gcd(a: Int, b: Int): Int {
    return if(b == 0){
        a}
    else if(a < b){
        gcd(a, b % a)
    }else{
        gcd(b, a % b)
    }
}

fun minimize(f: PhanSo): PhanSo {
    val currentGcd = if (f.a > 0 && f.b > 0) {
        gcd(f.a, f.b)
    } else if (f.a < 0 && f.b > 0) {
        gcd(-f.a, f.b)
    } else if (f.a > 0 && f.b < 0) {
        gcd(f.a, -f.b)
    } else {
        gcd(-f.a, -f.b)
    }
    return PhanSo(f.a / currentGcd, f.b / currentGcd)
}