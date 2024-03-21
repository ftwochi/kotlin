class Car ( var brand: String, var model: String, var year : Int) {
    fun drive() {
        println("Broom!")
    }
}

fun main() {
    val c1 = Car("Ford", "Mustang", 1969)
    val c2 = Car("BMW" , "X5" , 1999)
    val c3 = Car( "Tesla" , "Model 5" , 2020)

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    println(c1.brand)
    println(c2.model)
    println(c3.year)

    println(c3.brand)
    c1.drive()
}