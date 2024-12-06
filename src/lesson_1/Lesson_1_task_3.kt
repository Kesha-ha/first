package lesson_1


fun main() {

    val year:Int = 1961
    var hour:Int = 9
    var minute:Int = 7
    println("Год полета - " + year)
    println("Взлет - "+"%02d".format(hour)+":"+"%02d".format(minute))
    hour = 10
    minute = 55
    println("Посадка - " + hour+":" +minute)

}