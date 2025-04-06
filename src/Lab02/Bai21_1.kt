package Lab02

@Json
class Employee(
    private val empID: String,
    firstName: String?, lastName: String?, middleName: String?,
    private val email: String,
    private val salary: Int,
    private val address: String
) {
    private val fullname: Fullname

    init{
        fullname = Fullname(firstName, lastName, middleName)
    }

    internal data class Fullname(private val firstName: String?, private val lastName: String?, private val middleName: String?)
}