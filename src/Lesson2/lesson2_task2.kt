package Lesson2

fun main() {
    val numberOfEmployees: Byte = 50
    val salaryOfEmployees: Short = 30000
    val numberOfInterns: Byte = 30
    val salaryOfInterns: Short = 20000

    val salaryOfPermanentEmployees = numberOfEmployees * salaryOfEmployees
    val salaryOfPermanentInterns = numberOfInterns * salaryOfInterns
    val totalSalary = salaryOfPermanentEmployees + salaryOfPermanentInterns
    val averageSalary = totalSalary / (numberOfEmployees + numberOfInterns)

    println("salaryOfPermanentEmployees = $salaryOfPermanentEmployees")
    println("salaryOfPermanentInterns = $salaryOfPermanentInterns")
    println("totalSalary = $totalSalary")
    println("averageSalary = $averageSalary")
}