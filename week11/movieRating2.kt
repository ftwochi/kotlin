fun main() {
    // Prompt the use for movie ratings and age
    println("Enter the movie ratingG, PG, PG-13, R,NC-17: ")
    val movieRating = readLine()?.toUpperCase()
    println("Enter your age: ")
    val age = readLine()?.toIntOrNull()
    // Check if the inputs are valid
    if (movieRating == null || age == null) {
        println("Invalid input. Please enter valid movie rating and age.")
        return
    }
    // Check if the user is allowed to watch the movie
    val isAllowed = when (movieRating) {
        "G" -> true
        "PG" -> true
        "PG-13" -> age >= 13
        "R" -> age >= 15
        "NC-17" -> age >= 21
        else -> false
    }
    // Display the resul
    if (isAllowed) {
        println("You are allowed to watch the movie.")
    } else {
        println("Sorry, you are not allowed to watch the movie.")
    }
}
