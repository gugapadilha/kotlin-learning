fun main () {
    val fromApi = "BronZE"
    val accountTypes = AccountTypes.valueOf(fromApi.toUpperCase())
    println(fromApi.toUpperCase())
    println(accountTypes.calculatedDiscountPercent())

    /* EXEMPLO FOR EACH E IN - PERCORRER A CLASS */
   // AccountType.values().forEach { println(it) } //mesma coisa que o de baixo(printa todos os elementos)

    for(AccountTypes in AccountType.values()) {
        println(AccountTypes)
    }
    /* FIM EXEMPLO FOR EACH E IN - PERCORRER A CLASS */
}

enum class AccountTypes() {
    BRONZE {
        override fun calculatedDiscountPercent() = 5 //instead to open {} and write return 5, i can do that
    },
    SILVER{
        override fun calculatedDiscountPercent() = 10
    },
    GOLD{
        override fun calculatedDiscountPercent(): Int {
            return 15 //i can do this way too, have no problem
        }
    },
    PLATNIUM{
        override fun calculatedDiscountPercent()= 20
    };

    abstract fun calculatedDiscountPercent(): Int


}