package model

class HourlySalaryEmployee(
    name:String,
    id:Long,
    val totalHour:Int,
    val hourlyRate:Int = 100
):Employee(name,id) {
    override fun calculateSalary() = (totalHour * hourlyRate).toDouble()

}