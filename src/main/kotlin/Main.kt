import model.BaseSalaryEmployee
import model.ComissionSalaryEmployee
import model.Employee
import model.HourlySalaryEmployee

fun main() {

    val bse = BaseSalaryEmployee("Ibrahim",49L,1000.0)
    val hse = HourlySalaryEmployee("Hasan",45L,10,50)
    val cse = ComissionSalaryEmployee("Tomal",78L,10000.0,1000.0)

    val manager = SalaryManager(cse)
    manager.pay()

    val employees:List<Employee> = listOf(bse,hse,cse)
    for(employee in employees){
        val manager = SalaryManager(employee)
        println("$employee - ${manager.pay()}")
    }

    /*println("$bse - ${bse.calculateSalary()}")
    println("$hse - ${hse.calculateSalary()}")
    println("$cse - ${cse.calculateSalary()}")*/
}

class SalaryManager(val employee: Employee){
    fun pay() = employee.calculateSalary()
}