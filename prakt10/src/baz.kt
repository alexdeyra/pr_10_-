
fun main() {
    val warehouseItem = WarehouseItem("Item A", 100.0, 10, 2019)
    val subWarehouseItem = SubWarehouseItem("Item B", 150.0, 5, 2020)
    val evaluator = QualityEvaluatorClass()
    warehouseItem.printInfo()
    println("---------------------")
    subWarehouseItem.printInfo()
    println("---------------------")
    println("Quality from QualityEvaluatorClass: ${evaluator.calculateQuality()}")
}