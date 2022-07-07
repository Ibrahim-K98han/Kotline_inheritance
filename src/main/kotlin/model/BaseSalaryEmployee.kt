package model

class BaseSalaryEmployee(name:String, id:Long, var salary:Double)
    : Employee(name,id) {
    override fun calculateSalary() = salary
}