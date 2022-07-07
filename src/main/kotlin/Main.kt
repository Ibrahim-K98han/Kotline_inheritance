import interfac.FoodAllowance
import model.BaseSalaryEmployee
import model.ComissionSalaryEmployee
import model.Employee
import model.HourlySalaryEmployee
import store.Manufacturer
import store.Product
import store.Store
import store.StoreKeeper
import java.awt.Stroke
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val store = Store(
        storeKeeper =  StoreKeeper("MR.ABC"),
        productList = listOf(
            Product(
                name = "Watch",
                price = 5000.0,
                manufature = Manufacturer(manufatureName = "Samsung")
            ),
            Product(
                name = "TV",
                price = 25000.0,
                manufature = Manufacturer(manufatureName = "Samsung")
            ),
            Product(
                name = "Mobile",
                price = 15000.0,
                manufature = Manufacturer(manufatureName = "LG")
            ),
            Product(
                name = "Tab",
                price = 12000.0,
                manufature = Manufacturer(manufatureName = "Xiaomi")
            ),
            Product(
                name = "Laptop",
                price = 55000.0,
                manufature = Manufacturer(manufatureName = "HP")
            ),
        )
    )
    for (product in store.productList){
        println("${product.name} ${product.price} ${product.manufature.manufatureName}")
    }
    println("Search a Product: ")
    var searchProduct:Product? = null
    val query = getStringQuery(scanner)

    for(product in store.productList){
        if(product.name.lowercase() == query.lowercase()){
            searchProduct = product
            break
        }
    }
    if(searchProduct != null){
        print(searchProduct)
    }else{
        print("Not Found!!")
    }
}

fun getStringQuery(scanner: Scanner) = scanner.nextLine()

class SalaryManager(val employee: Employee){
    fun pay() = employee.calculateSalary()
}

class AllowanceManager()