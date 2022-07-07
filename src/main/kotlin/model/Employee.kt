package model

abstract class Employee(val name:String, val id:Long) {
    abstract fun calculateSalary():Double
}