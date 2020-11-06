
fun main() {
    val murai = Fowl()
    murai.name = "murai batu"
    murai.age = 6
    murai.type = "vertebrata"
    println(murai.toString())
    println("${murai.name} state: ${murai.animalState()}")
    print("\n")
    val tenggiri = Fish(name = "tenggiri laut", age = 3, type = "vertebrata")
    println(tenggiri.toString())
    println("${tenggiri.name} state: ${tenggiri.animalState()}")
    println("${tenggiri.name} mass with water: ${tenggiri.calculateMass(10, 5)}")
    println("${tenggiri.name} mass without water: ${tenggiri.calculateMass(10)}")

}
