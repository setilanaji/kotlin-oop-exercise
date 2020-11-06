internal class Fish(age: Int, name: String, type: String) : Animal() {

    init {
        super.age = age
        super.type = type
        super.name = name
    }

    private fun calculateMass(_weight: Int): Int = age * _weight

    fun calculateMass(_weight: Int, _waterCount: Int = 0): Int = calculateMass(_weight = _weight) - _waterCount
}