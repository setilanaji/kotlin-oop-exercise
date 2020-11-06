internal class Unggas : Animal(){

    override fun animalState(): String {
        return when{
            age < 1 -> "Belum siap diternakan"
            age >= 1 -> "Siap diternakan"
            else -> ""
        }
    }
}