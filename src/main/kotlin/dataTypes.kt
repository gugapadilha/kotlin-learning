fun main () {
    var name: String //colocar o tipo sempre, pois caso eu não passe o valor agora, posso passar depois
    name = "guga"

    //Tudo em Kotlin é objeto. (assim como no JavaScript)
    var age: Int = 10
    var isAlive: Boolean = true
    var marks: Float = 97.4F //se for usar . colocar o F, para entender que o tipo é Float, e não Double
    var percentage: Double = 90.78
    var gender: Char = 'm'

    //NUMBERS AND BITS DATA TYPES

    val myBite: Byte = 8 //8-bit signed integer
    val myShort: Short = 16 // 16-bit signed integer
    val myInt: Int = 32 // 32-bit signer integer
    val myLong: Long = 64 // 64-bit signed integer

    //DECIMAIS
    val myFloat: Float = 32.00F // 32-bit floating point number
    var myDouble: Double = 64.00 // 64-bit floating point number

    //println(myBite.toDouble()::class) //class kotlin.Double
    println(myBite.toLong()::class) //class kotlin.Long

    val bigLong: Long = 1_000_000 //apenas melhor para ler
    println(bigLong) //ele ignora os _ quanndo imprime na tela

    val newInt = myInt.plus(12)
    println(newInt)


    var firstName = "gustavo" //double quote: String
    val c: Char = 'x'// 16-bit unicode character.
    //obrigado usar aspas simples. // single quote: Char


    //Exemplos
    var numeros: Int = 10
    println(numeros + 10)

    var verdadeOuFalso: Boolean = true
    if (numeros === 10){
        println(verdadeOuFalso)
    } else {
        println(false)
    }

    val x: Char = 'G'
    println(x + 'P'.toString())

    var fullName: String = "guga Padilha"
    println(fullName)

    fullName = ""
    println(fullName) //retorna apenas um espaço em branco

    println(fullName.isEmpty()) //retona true pois o fullName está sem valor algum


    //TRIPLE QUOTES

    var message: String = """
        |Hello,
        |My name is Gustavo Padilha
        |How are you?
    """.trimMargin() //faz a identacao sem os epaços caso tenha algo antes
        //.replaceIndent( "abc-|-") coloca antes da frase (nos espaços em branco)
        //.trimIndent() //minimal identation, se nao colocar, a frase fica com lacunas

    println(message)


    //STRINGS INTERPOLATION

    val rect = Rectangle() //.rect pra acessar o length e breadth que foi definido.
     rect.length = 5
     rect.breadth = 3
    //15 -> total

    print("The lenght of rectangle is ${rect.length}.The breadth is ${rect.breadth}.The area is: ${rect.length * rect.breadth}")
}

class Rectangle {
    var length: Int = 0
    var breadth: Int = 0
}