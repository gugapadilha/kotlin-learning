fun main () {
    var frutas = JuiceSalad("Morango", "Abacaxi", "Manga", "Uva")
    frutas.saladLength()
}

open class FruitSalad(var fruta1: String) {

    init {
        println("O engrediente principal da Salada de frutas é: $fruta1")
    }
}

class JuiceSalad(fruta1: String ,var fruta2: String, var fruta3: String, var fruta4: String): FruitSalad(fruta1){

    init {
        println("A salada de frutas possui: $fruta1, $fruta2, $fruta3 e $fruta4")
    }

    fun saladLength() {
        println("O tamanho da palavra da primeira fruta é: " + fruta1.length)
    }
}
