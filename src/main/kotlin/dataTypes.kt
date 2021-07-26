fun main () {
    var name: String //colocar o tipo sempre, pois caso eu não passe o valor agora, posso passar depois
    name = "guga"

    //Tudo em Kotlin é objeto. (assim como no JavaScript
    var age: Int = 10
    var isAlive: Boolean = true
    var marks: Float = 97.4F //se for usar . colocar o F, para entender que o tipo é Float, e não Double
    var percentage: Double = 90.78
    var gender: Char = 'm'

    //Exemplos
    var numeros: Int = 10
    println(numeros + 10)

    var verdadeOuFalso: Boolean = true
    if (numeros === 10){
        println(verdadeOuFalso)
    } else {
        println(false)
    }

}