fun main () {
    //WHEN LOOP - numero igual
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


    //FOR LOOP - nameList & numero par

    var nomes = arrayOf("Arthur", "Guga", "Pegueto")
    for (i in nomes) {
        println(i)
    }

    for (i in 1..10){
        if(i % 2 == 0){
            println(i)
        }
    }


    //WHILE LOOP - numero impar

    var i: Int = 1

    while(i <= 10){
        if(i % 2 !== 0){
            println(i)
        }
        i++
    }


    //DO WHILE LOOP - numero par até 5
    var c: Int = 1

    do {
        if(c % 2 == 0){
            println(c)
        }
        c++
    }while (c <= 5)


    //BREAK LOOP numero 3

    for (i in 1..20) {
        println(i)
        if (i == 3){
            break //quebrou quando chegou no 3
        }
    }

    //BREAK LOOP 2 2 E PARE
    //Um break qualificado com um rótulo salta para o ponto de execução logo após o loop marcado com aquele rótulo.

   myLoop@for (x in 1..3){
        for(y in 1..3){
            println("$x $y")
            if(x == 2 && y == 2){ //quando a condicao for igual a (2 2) ele para.
                break@myLoop //falando para o break quebrar fora do primeiro for loop
            }
        }
    }

    //BREAK LOOP 5 E CONTINUE
    //A continue prossegue para a próxima iteração desse loop.

    for (i in 1..10){
        if(i == 5){ //pulou o numero 5, e depois rodou normalmente o resto
            continue
        }
        println(i)
    }


    //BREAK LOOP 2 2 E CONTINUE
    //Um break qualificado com um rótulo salta para o ponto de execução logo após o loop marcado com aquele rótulo.
    //A continue prossegue para a próxima iteração desse loop.

        outer@ for (m in 1..3) {
            for (n in 1..3){
                if(m == 2 && n == 2){
                    continue@outer //falando pro outer quebrar fora do primeiro loop
                }
                println("$m $n")
            }
        }
}
