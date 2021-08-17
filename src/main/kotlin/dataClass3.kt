fun main () {

    val usuarioPessoa = UmaPessoa("sherlock", "holmes", 24)

    //COPY A KOTLIN DATA CLASS INSTANCE

    val sibling = usuarioPessoa.copy(primeiroNome = "sam", idade = 40) //copying the usuarioPessoa and changing name and age.

    println(usuarioPessoa)
    println(sibling)

    val order = Order(amount = 100, costumer = sibling)
    println(order)

    val newOrder = order.copy(amount = 200)//changing the amount and printing
    println(newOrder)

    val newOrder2 = order.copy(costumer = usuarioPessoa) //catching the usuarioPessoa's age and printing
    println(newOrder2)


    //DESTRUCTURE DATACLASS

    val(beterraba, component2, canivete) = usuarioPessoa

    println(beterraba) //i can pass whatever value in this components
    println(component2) //i just have to change to the equal name upside
    println(canivete) //and will printed in order like i pass in the class

}

data class Order(val amount: Int, val costumer: UmaPessoa)

data class UmaPessoa(var primeiroNome: String, var ultimoNome: String, var idade: Int)