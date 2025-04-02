package Lab02

fun main() {
    drawRect(8, 4)
    drawRect1(8, 4)
}

fun drawRect(width: Int, height: Int) {
    for(index in 0..height - 1) {
        for(index1 in 0..width - 1) {
            print(" * ")
        }
        println("  ")
    }
}

fun drawRect1(width: Int, height: Int) {
    for(index in 0..height - 1) {
        for (index1 in 0..width - 1) {
            print(if(index == 0 || index == height - 1 || index1 == 0 || index1 == width - 1) " * " else "   ")
        }
        println()
    }
}

fun PrintUseBreak(i: Int){
    loop1@ for(i in 1..50) {            // Có thể thêm nhãn, nếu break thì có thể thoát khỏi vòng for loop1 hoặc loop2
        loop2@ for(j in 1..100){
            if(i % 10 == 0)
                break@loop1
        }
        println("hi")
    }
}