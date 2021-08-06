class Usuario constructor(var primeiroNome: String, var ultimoNome: String, var clientePlat: Boolean) { //exportando por classConstructor.kt

    constructor(primeiroNome: String, ultimoNome: String): this(primeiroNome, ultimoNome, true){
        if(clientePlat == false){
            println("cliente platina é false")
        }else {
            println("cliente platina é true")
        }
    }

    /*init {                    //antes de rodar o constructor ele roda primeiro o init
        println("ola usuario") //depois ele vai para o construtor, e após, roda o init novamente
    }*/                       //por fim, ele roda o segundo constructor

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