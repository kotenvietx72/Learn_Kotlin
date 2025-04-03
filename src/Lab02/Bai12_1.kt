package Lab02
// Kế thừa

open class Father {

}

class Son : Father() {
    // override lại 3 hàm có sẵn
    override fun toString(): String {
        return super.toString()
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}

open class point {
    var x: Int
    var y: Int

    override fun toString(): String {
        return "Point($x, $y)"
    }

    constructor() {
        x = 0
        y = 0
    }

    constructor(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    constructor(x: Int) {
        this.x = x
        y = 0
    }
}

open class Point3D : point {
    var z: Int = 0
    override fun toString(): String {
        return "Point3D($x, $y, $z)"
    }

    constructor(){
        x = 0
        y = 0
        z = 0
    }

    // Kế thừa constructor => Dùng super
    constructor(x: Int, y: Int, z: Int) : super(x, y) {
        this.z = z
    }

}

class Point4D(x: Int,y: Int,z: Int, t: Int) : Point3D(x, y, z) {
    val t: Int

    override fun toString(): String {
        return "Point4D($x, $y, $z, $t)"
    }

    init {
        this.t = t
    }
}

fun main() {
    val point3D = Point3D(1, 2, 3)
    val point4D = Point4D(1, 2, 3, 4)
}