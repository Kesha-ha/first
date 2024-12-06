package lesson1


fun main() {
    val lenght:Long = 40_868_600_000
    val age:Short = 27
    val partOfDay:Double = 0.075
    val secods:Int = 6480
    val partOfYear:Double = 2.0547945205479453E-4
    val apogee:Int = 327000

    println("Расстояние - "+lenght)
    println("Возраст - " + age)
    println("Часть дня - " + partOfDay)
    println("Секунды - "+secods)
    println("Часть года - " + partOfYear)
    println("Апогей орбиты - "+apogee)

    println("Время, проведенное в космосе - "+"%02d".format(secods/3600)+":"+"%02d".format(((secods/60)-((secods/3600)*60)))+":"+"%02d".format((secods-((secods/60)*60))))

}