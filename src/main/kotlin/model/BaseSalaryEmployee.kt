package model

import interfac.FoodAllowance

class BaseSalaryEmployee(name:String, id:Long, var salary:Double)
    : Employee(name,id), FoodAllowance {
    override fun calculateSalary() = salary
    override fun payFoodAllowance() {
        println("Pay Food Allowance to $name")
    }

    override fun toString(): String {
        return "${super.toString()} BaseSalaryEmployee(salary=$salary)"
    }

}