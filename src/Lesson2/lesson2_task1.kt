fun main() {

    val studen1: Byte = 3
    val studen2: Byte = 4
    val studen3: Byte = 3
    val studen4: Byte = 5
    val numberOfRatings: Byte = 4

    val averageScore: Float = ((studen1 + studen2 + studen3 + studen4) / numberOfRatings).toFloat()
    println("Average score is %02.2f".format(averageScore))


}