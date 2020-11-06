
internal open class Animal {

    var age: Int = 0
        internal set
    var type: String = ""
        internal set
    var name: String =""
        internal set

    open fun animalState(): String{
        return when{
            age < 1 -> "Belum siap diternakan"
            age in 1..4 -> "Siap diternakan"
            age > 5 -> "Hewan sudah tua"
            else -> ""
        }
    }

    override fun toString(): String {
        return "name: $name, type: $type, age: $age"
    }
}