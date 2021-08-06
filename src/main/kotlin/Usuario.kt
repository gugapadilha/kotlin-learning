class Usuario constructor(var primeiroNome: String, var ultimoNome: String, var clientePlat: Boolean) { //exportando par classConstructor.kt

    constructor(primeiroNome: String, ultimoNome: String): this(primeiroNome, ultimoNome, true){
        if(clientePlat == false){
            println("cliente platina é false")
        }else {
            println("cliente platina é true")
        }
    }

    fun nomeCompleto() {
        println(" $primeiroNome $ultimoNome")
    }

    fun tamanhoNome() {
        println(primeiroNome.length)
    }

    fun atualizarNome(novoNome: String) {
        primeiroNome = novoNome
    }

}