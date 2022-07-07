package model

class ComissionSalaryEmployee(
    name:String,
    id:Long,
    val salary:Double,
    val totalSale:Double,
    val commissionRate:Double = 2.5
):Employee(name,id) {
    override fun calculateSalary() = salary + (totalSale * commissionRate)/100

}