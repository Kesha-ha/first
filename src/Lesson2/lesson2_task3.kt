package Lesson2

fun main() {

    val hour: Byte = 9
    val minute: Byte = 39
    val numberOfHours = 60
    val travelTimeInMinutes: Short = 457

    val arrivialHour = (travelTimeInMinutes / numberOfHours) + hour
    val arrivialMinute = (travelTimeInMinutes % numberOfHours) + minute
    val changeMinutes = arrivialMinute % numberOfHours
    val changeHours = arrivialHour + (arrivialMinute / numberOfHours)

    println("Время прибытия: $changeHours : $changeMinutes")
}