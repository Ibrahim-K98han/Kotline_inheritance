package model

import interfac.FoodAllowance
import interfac.TransportAllowance
import sun.rmi.transport.Transport

class ComissionSalaryEmployee(
    name:String,
    id:Long,
    val salary:Double,
    val totalSale:Double,
    val commissionRate:Double = 2.5
):Employee(name,id),FoodAllowance,TransportAllowance {
    override fun calculateSalary() = salary + (totalSale * commissionRate)/100
    override fun payFoodAllowance() {
        println("Pay Food Allowance to $name")
    }

    override fun payTransportAllowance() {
        println("Pay Transport Allowance to $name")
    }

    override fun toString(): String {
        return "${super.toString()}ComissionSalaryEmployee(salary=$salary, totalSale=$totalSale, commissionRate=$commissionRate)"
    }


}