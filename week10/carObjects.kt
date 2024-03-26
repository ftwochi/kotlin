class Vehicle(var make: String, var model: String, var year: String ) {
    fun drive() {
        println("Your bank account info:")
    }
}

fun main() {
    val v1 = Vehicle("100,000", "3" , "2023")

    println(v1.make)
    println(v1.model)
    println(v1.year)
}
