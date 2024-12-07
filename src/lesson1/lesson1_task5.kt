package lesson1


fun main() {
    val lenght: Long = 40_868_600_000
    val age: Byte = 27
    val partOfDay: Float = 0.075f
    val secods: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000

    val hour = secods / 3600
    val minutes = (secods / 60) - ((secods / 3600) * 60)
    val sec = secods - ((secods / 60) * 60)

    println("Расстояние - $lenght")
    println("Возраст - $age")
    println("Часть дня - $partOfDay")
    println("Секунды - $secods")
    println("Часть года - $partOfYear")
    println("Апогей орбиты - $apogee")

    println("Время, проведенное в космосе - $hour:$minutes:$sec")

}