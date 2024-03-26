fun main() {
        print("Enter a number from 1 to 6 and you will get a piece of a pyramid: ")
        var number= readLine()!!.toString()
        when(number) {
            "1" -> println("*")
            "2" -> println("**")
            "3" ->  println("***")
            "4" -> println("****")
            "5" -> println("*****")
            "6" -> println("******")
            else -> print("Invalid number/Error has occurred.")
        }
}
