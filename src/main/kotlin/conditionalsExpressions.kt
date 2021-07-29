fun main () {
    val a = 2
    val b = 5

    val maxValue: Int

    if (a > b){
        maxValue = a
    }else {
        maxValue = b
        println("este é o melhor valor")
    }
    println(maxValue)


    //STRUCTURAL

    var name1: String = "guga"
    var name2: String = "augustinho"

    println(name1 != name2)


    //REFERENTIAL

    var i = 12
    var j = 12
    //println(i === j) //true

    var x = Persons("guga")
    var y = Persons("guga")

    println(x === y)



    //NULLABEL TYPES - poder retornar um valor NULL

    var nome: String? = "xisdead" //precisa colocar o "?" para conseguir mudar o valor para null
    nome = null

    var idade: Int? = 19 //mesma coisa na idade para permitir
    idade = null

    var pessoas = Pessoas("Foo") //não posso colocar o "?" diretamente neste caso, pois é uma class
    //person = null [ETORNA ERRO], pois uma classe não pode ser definida como nula diretamente.

    var pessoas2: Pessoas? = Pessoas("Foo") //posso mudar para null, pois agr recebeu o valor anterior
    pessoas2 = null //funciona, pois consigo mudar a var depois que ela foi definida anteriormente



    //NULLABEL SAFE CALLS - previne que o programa retorne um valor vazio

    var firstName: String? = "Gustavo"//se o firstName for NULL, vai mudar a var lenght para NULL também
    val lenght =  firstName?.length //se não, ele mostra o lenght, pode retornar NULL ou 7

    var lenght2 = if(firstName != null) firstName.length else null // 7 ou NULL

    var lenght3 = firstName?.substring(0, 2)?.length
    println(lenght3)
}


class Persons(var name: String) //false, pois a E b não são os mesmos

class Pessoas(val nome: String)