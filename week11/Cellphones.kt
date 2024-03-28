class Cellphone(var brand: String, var model: String, var price: String)
fun drive() {
    println("Cellphone info:")
}
fun main () {
    val cp1 = Cellphone ("Samsung", "Galaxy S24", "$799")
    val cp2 = Cellphone ("Apple", "iPhone 14", "$1,200" )

    println(cp1.brand)
    println(cp1.model)
    println(cp1.price)

    println(cp2.brand)
    println(cp2.model)
    println(cp2.price)
}
