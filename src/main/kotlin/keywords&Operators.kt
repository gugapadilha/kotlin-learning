fun main () {
    //WHEN - numero igual
    val x = 11

    when(x) {
        0, 1 -> println("x is 0 or 1")
        2 -> println("x is 2")
        in 3..20 -> println(" x is between 3 and 20")
        else -> {
            println("x is unknow")
            println("i dont know what is x")
        }
    }
    println(x)


    val y = 2
    var str: String = when (y) {
        1 -> "y is 1"
        2 -> "y is 2"
        else -> {
            "y value is unknow"
        }
    }
    println(str)


    //FOR - numero par

    var nomes = arrayOf("Arthur", "Guga", "Pegueto")
    for (i in nomes) {
        println(i)
    }
}