fun main() {
    println("Enter the item's wholesale cost:")
    val wholesaleCost = readLine()?.toDoubleOrNull()
    if (wholesaleCost == null || wholesaleCost < 0) {
        println("Invalid input for wholesale cost.")
        return
    }
    println("Enter the markup percentage:")
    val markupPercentage = readLine()?.toDoubleOrNull()
    if (markupPercentage == null || markupPercentage < 0) {
        println("Invalid input for markup percentage.")
        return
    }
    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)
    println("The item's retail price is: $retailPrice")
}
    fun calculateRetail(wholsesaleCost: Double, markupPercentage: Double): Double {
        return wholesaleCost * (1 + markupPercentage / 100)
    }
