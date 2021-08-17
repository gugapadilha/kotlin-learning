fun main () {

    val usuarioPessoa = UmaPessoa("sherlock", "holmes", 24)

    //DESTRUCTURE DATACLASS
    val(beterraba, component2, canivete) = usuarioPessoa

    println(beterraba) //i can pass whatever value in this components
    println(component2) //i just have to change to the equal name upside
    println(canivete) //and will printed in order like i pass in the class

}

data class UmaPessoa(var primeiroNome: String, var ultimoNome: String, var idade: Int)