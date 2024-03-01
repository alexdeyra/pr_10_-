abstract class WarehouseItem(
    val name: String,
    val price: Double,
    val quantity: Int) {
    constructor(name: String, price: Double, quantity: Int, year: Int) : this(name, price, quantity)

    abstract fun calculateQuality(): Double
    open fun printInfo() {
        println("Warehouse Item: $name")
        println("Price: $price")
        println("Quantity: $quantity")
        println("Quality: ${calculateQuality()}")
    }
}

interface QualityEvaluator {
    fun calculateQuality(): Double
}

class SubWarehouseItem(
    name: String,
    price: Double,
    quantity: Int,
    val year: Int
) : WarehouseItem(name, price, quantity), QualityEvaluator {

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


class QualityEvaluatorClass : QualityEvaluator {
    override fun calculateQuality(): Double {
        return 5.0
    }
}