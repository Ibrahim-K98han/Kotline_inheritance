import interfac.FoodAllowance
import model.BaseSalaryEmployee
import model.ComissionSalaryEmployee
import model.Employee
import model.HourlySalaryEmployee

fun main() {



}

class SalaryManager(val employee: Employee){
    fun pay() = employee.calculateSalary()
}

class AllowanceManager()