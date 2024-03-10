fun celsius(fahrenheit: Double): Double {
    return (5.0 / 9.0) * (fahrenheit - 32)
}
fun main() {
    println("Fahrenheit  Celsius")
    println("---------------------")
    for (f in 0..20) {
        val c= celsius(f.toDouble())
        println("$f°F        ${"%.2f".format(c)}°C")
    }
}
