package Lab02

open class Person
class Student5: Person()

fun Person.getClassName() = "Person"
fun Student5.getClassName() = "Student"

fun printClassName(person: Person) {
    println(person.getClassName())
}

class Example {
    fun printFunctionInfo() {
        println("Phương thức printFunctionInfo() của lớp Example")
    }
}

fun Example.printFunctionInfo() {
    println("Hàm mở rộng printFunctionInfo() của lớp Example")
}

fun main() {
    val student = Student5()
    printClassName(student)

    val obj = Example()
    obj.printFunctionInfo()
}