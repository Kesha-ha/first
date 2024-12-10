package lesson1


fun main() {

    val secods: Short = 6480
    val numberOfSecondsPerHour: Short = 3600
    val numberOfMinute: Short = 60
    val hours = secods / numberOfSecondsPerHour
    val minutes = (secods / numberOfMinute) - ((secods / numberOfSecondsPerHour) * numberOfMinute)
    val seconds = secods - ((secods / numberOfMinute) * numberOfMinute)

    println("Время, проведенное в космосе %02d:%02d:%02d".format(hours, minutes, seconds))


}