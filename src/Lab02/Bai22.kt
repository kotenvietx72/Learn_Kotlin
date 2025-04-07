package Lab02

// Đảm bảo gọn code và chương trình không xảy ra ngoại lệ

class Course(val student: List<Student7>? = null)

class Student7(val first: String, var last: String, var middle: String) {
    fun doExam(subject: String){
        println("Doing exam for $subject")
    }
}

fun getCourse(name: String): Course? {
    return null
}

open class Father3

class Child2: Father()

fun main() {
    // Dấu ?: Cho phép biến đó có thể null
    var x: Int? = null

    var r= x?.toLong()

    // Tương tự với biểu thức sau
    if(x != null)
        r = x.toLong()

    val course: Course? = getCourse("Kotlin")
    println(course?.student?.get(0)?.first)

    val fullname: String? = null
    val namelength = fullname?.length ?: throw Exception("Name is null")
    // Tương đương với: if(fullname != null) length else 0

    // !!: Chuyển đổi bất kì giá trị nào trước nó thành kiểu k null, và đưa ra ngoại lệ nếu giá trị chuyển đổi là null, dùng khi giá trị có thể null
    val namelength1 = fullname!!.length

    val father: Father3? = null
    val child: Child2? = father as? Child2      // as: Ép kiểu từ kiểu cha về kiểu con, nếu ép kiểu về biến có thể null, thêm dấu ? (Ép kiểu an toàn)

    val father1: Father3? = Father3()           // Nếu đổi tượng cần ép kiểu không null, đối tượng nhận có thể null thì phải thêm dấu ?
    val child1: Child2? = father1 as? Child2
}