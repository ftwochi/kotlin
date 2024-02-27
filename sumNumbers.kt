fun main() {
    var total=0
    while ( total < 1275) {
        println(total +1)
        total++ until 1275
    }
    var userInput: Int? = null
    while (userInput == null) {
        print("Enter a positive integer: ")
        val input = readLine()
        try {
            userInput = input?.toInt()
            if (userInput != null && userInput < 0) {
                println("Invalid input. Please enter a positive integer.")
                userInput = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer.")
        }
    }
    println("You entered $userInput.")
}
