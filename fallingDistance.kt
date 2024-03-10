fun main() {
    fun fallingDistance(t: Int): Double {
        val g = 9.8
        val d = 0.5
        return d
    }
    for(t in 1..10){
        val distance = fallingDistance(t)
        println("time: $t seconds, Distance: ${"%.2f" .format(distance)} meters")
    }
}
