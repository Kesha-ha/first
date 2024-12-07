package lesson_1


fun main() {

    val year: Int = 1961
    var hour: String = "09"
    var minute: Int = 7
    var formattedMinute = minute.toString().padStart(2, '0')

    println("Год полета - $year")
    println("Взлет - $hour : $formattedMinute")
    hour = "10"
    minute = 55
    println("Посадка - $hour : $minute")

}