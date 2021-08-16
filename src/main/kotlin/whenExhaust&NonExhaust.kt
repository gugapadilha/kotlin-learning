fun main () {
    val accountsTypes = AccountsTypes.GOLD

    //NON-EXHAUST WHEN (DOESNT NEED TO USE ALL THE OPTION)
    when(accountsTypes){
        AccountsTypes.GOLD -> println("This is gold")
    }

    //EXAUSTIVE WHEN (PROVIDE ALL THE OPTIONS)

    val message = when (accountsTypes) {
        AccountsTypes.BRONZE -> {
            "BRONZE Member Access Alowed"
        }
        AccountsTypes.SILVER -> {
            "SILVER Member Access Alowed"
        }
        AccountsTypes.GOLD -> {
            "GOLD Member Access Alowed"
        }
        AccountsTypes.PLATINIUM -> {
            "Platinium Member Access Alowed"
        }
        else -> "Unknown Member Type"
    }
    println(message)

}

enum class AccountsTypes {
    BRONZE,
    SILVER,
    GOLD,
    PLATINIUM,
    ONYX;
}