fun main () {

    //println(AccountType.GOLD)

    val accountTypeFromApi = "gold"
    val accountOnly = AccountType.valueOf(accountTypeFromApi.toUpperCase())
    //println(accountOnly) //its equal to accountType.GOLD, cause both return the same value

    println(AccountType.GOLD)
    println(AccountType.GOLD.discountPercent)
    println(AccountType.GOLD.numberOfSubscriptions)

    val value = AccountType.valueOf("Platinium".toUpperCase())
    println(value)
    println(value.discountPercent)
    println(value.numberOfSubscriptions)

    /* STATIC METHODS*/
    val showName = AccountType.getAccountTypeByName("silVER")
    println(showName)

    /* ITERATE OVER ENUM VALUES*/
    AccountType.values().forEach { println(it) } //percorrendo a lista accountType

}

enum class AccountType(var discountPercent: Int,var numberOfSubscriptions: Int) {
    BRONZE(10, 20),
    SILVER(15, 10),
    GOLD(20, 5),
    PLATINIUM(25, 2);

    /* STATIC METHODS */
    companion object {
        fun getAccountTypeByName(name: String) = valueOf(name.toUpperCase())
    }
}