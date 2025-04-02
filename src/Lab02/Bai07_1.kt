package Lab02

fun main() {
    val a = 100
    val b = 200
    println(findMax(a,b))

    val gpa = 3.25f
    val s = if(gpa < 3.5f) "Không qua môn" else "Qua môn"
}

fun findMax(a:Int, b:Int): Int = if(a > b) a else b