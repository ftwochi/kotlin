fun condition(i: Int) = 1 < 100

    fun main() {
    var i = 0
    while(condition(i)) {
        println(".")
        i += 10
    }
}
