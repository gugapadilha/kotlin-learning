fun main () {

    //println(AccountType.GOLD)

    val accountTypeFromApi = "gold"
    val accountOnly = AccountType.valueOf(accountTypeFromApi.toUpperCase())
    println(accountOnly) //its equal to accountType.GOLD, cause both return the same value
}

enum class AccountType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINIUM
}