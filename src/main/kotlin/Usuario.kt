class Usuario constructor(var primeiroNome: String, var ultimoNome: String) { //exportando par classConstructor.kt

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