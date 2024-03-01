abstract class WarehouseItem(
    val name: String,
    val price: Double,
    val quantity: Int) : QualityEvaluator{
    constructor(name: String, price: Double, quantity: Int, year: Int) : this(name, price, quantity)

    override fun calculateQuality(): Double{
        return 5.0
    }
    open fun printInfo() {
        println("Warehouse Item: $name")
        println("Price: $price")
        println("Quantity: $quantity")
        println("Quality: ${calculateQuality()}")
    }
}


class SubWarehouseItem(
    name: String,
    price: Double,
    quantity: Int,
    val year: Int
) : WarehouseItem(name, price, quantity) {

    override fun calculateQuality(): Double {
        val baseQuality = price / quantity
        return baseQuality + 0.5 * (getCurrentYear() - year)
    }

    private fun getCurrentYear(): Int {
        return 2024
    }

    override fun printInfo() {
        super.printInfo()
        println("Year of Production: $year")
        println("Quality for SubWarehouseItem: ${calculateQuality()}")
    }
}