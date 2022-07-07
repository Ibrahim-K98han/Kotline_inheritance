import model.BaseSalaryEmployee
import model.ComissionSalaryEmployee
import model.HourlySalaryEmployee

fun main() {

    val bse = BaseSalaryEmployee("Ibrahim",49L,1000.0)
    val hse = HourlySalaryEmployee("Hasan",45L,10,50)
    val cse = ComissionSalaryEmployee("Tomal",78L,10000.0,1000.0)

    println("$bse - ${bse.calculateSalary()}")
    println("$hse - ${hse.calculateSalary()}")
    println("$cse - ${cse.calculateSalary()}")
}