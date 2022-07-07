package store

data class Store(
    val name:String = "ABC" ,
    val location:String = "Dhaka",
    val productList:List<Product>,
    val storeKeeper:StoreKeeper
)
