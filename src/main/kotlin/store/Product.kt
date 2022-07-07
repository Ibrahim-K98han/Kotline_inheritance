package store

data class Product (
    val name:String,
    val price:Double,
    val category:String = "Electronics",
    val manufature:Manufacturer
    )