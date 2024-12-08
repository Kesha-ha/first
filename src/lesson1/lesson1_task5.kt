package lesson1


fun main() {

    val secods: Short = 6480
    val numberOfSecondsPerHour: Short = 3600
    val numberOfMinute:Short = 60
    val hour = secods / numberOfSecondsPerHour
    val minutes = (secods / numberOfMinute) - ((secods / numberOfSecondsPerHour) * numberOfMinute)
    val sec = secods - ((secods / numberOfMinute) * numberOfMinute)
    val chengeHour = String.format("%02d", hour)

    println("Время, проведенное в космосе - $chengeHour:$minutes:$sec")

}