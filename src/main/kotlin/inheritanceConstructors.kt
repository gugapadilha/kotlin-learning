fun main () {
    var cachorro = Cachorro("preto", "pug")
}

open class Animais(var cor: String) {  //Super Class

    init {
        println("From Animais: $cor")
    }
}

class Cachorro(cor: String, var raca: String): Animais(cor) { //Derived Class

    init {
        println("From Animais: $cor and $raca")
    }
}

//POSSO FAZER DESTA FORMA, DARÁ NO MESMO

/*
open class Animais {
    var cor: String = ""

    constructor(cor: String) {
        this.cor = cor

        println("From Animais: $cor")
    }
}

class Cachorro: Animais {
    var raca: String = ""

    constructor(cor: String, raca: String): super(cor) {
        this.raca = raca

        println("From Cachorro: $cor and $raca")
    }
}
*/
