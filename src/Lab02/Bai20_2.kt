package Lab02

// out: Không cho phép cập nhật lại dữ liệu hàm nào đó (Chức năng chỉ cho hàm này đọc dữ liệu, không được chỉnh sửa)
fun fill(dest: Array<out String>, index: Int, value: String){
}

open class Base1

open class Father2 : Base1()

open class Child : Father2()

class Son1: Child()

// in: Cho class từ Father trở lên được truy cập hàm fill
fun fill1(dest: Array<in Father2>, index: Int, value: Father2){
    dest[index] = value
}

// Dấu *: Kiểu dữ liệu nào truyền vào cũng được, miễn là được hỗ trợ
fun printArr(arr: Array<*>) {
    for (i in arr.indices) {
        print(arr[i].toString() + " ")
    }
    println()
}

// Hàm generic, tạo ra hàm chung chung dùng cho tất cả mọi nơi
fun<T> printArr1(arr: Array<T>) {
    for (i in arr.indices) {
        print(arr[i].toString() + " ")
    }
    println()
}

fun <K, V> getValueByKet(map: Map<K, V>, key: K): V? {
    return map.get(key)
}

// Ràng buộc generic: chỉ các kiểu <= kiểu con của Number như
// Number, Int, Float, Double, Long... mới được chấp nhận
fun <T : Number> printArray(arr: Array<T>) {
    for (item in arr) {
        print("$item ")
    }
    println("n============================")
}

//inline fun <reified T: Any> String.toKotlinObject(): T {
//    val mapper = jacksonObjectMapper()
//    return mapper.readValue(this, T::class.java)
//}

// Toán tử gạch dưới: có thể được sử dụng để thay thế cho các tham số kiểu. Sử dụng nó trong trường hợp cần tự động suy luận 1 kiểu khi những kiểu khác đã được chỉ định rõ ràng
abstract class SomeClass<T> {
    abstract fun execute() : T
}

class SomeImplementation : SomeClass<String>() {
    override fun execute(): String = "Test"
}

class OtherImplementation : SomeClass<Int>() {
    override fun execute(): Int = 42
}

object Runner {
    inline fun <reified S: SomeClass<T>, T> run() : T {
        return S::class.java.getDeclaredConstructor().newInstance().execute()
    }
}

fun main() {
    val any = Array<Father2>(5) {Father2()}    // Các hàm có kế thừa từ father trở lên mới được truy cập hàm fill
    fill1(any, 0, Father2())

    val intArr = arrayOf(1,2,3)
    val floatarr = arrayOf(1.0f,2.0f,3.0f)
    val stringArr = arrayOf("a","b","c")

    printArr(intArr)
    printArr(floatarr)
    printArr(stringArr)

    // T is inferred as String because SomeImplementation derives from SomeClass<String>
    val s = Runner.run<SomeImplementation, _>()
    assert(s == "Test")

    // T is inferred as Int because OtherImplementation derives from SomeClass<Int>
    val n = Runner.run<OtherImplementation, _>()
    assert(n == 42)
}