class BankAccount(var accountNumber: String, var valance: String, var ownerName: String ) {
    fun drive() {
        println("Your bank account info:")
    }
}

fun main() {
    val b1 = BankAccount("119546", "12.00" , "AdrianaH")

    println(b1.accountNumber)
    println(b1.valance)
    println(b1.ownerName)
}
