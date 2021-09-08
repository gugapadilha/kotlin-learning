fun main () {
    // val lambdaName: (InputType) -> ReturnType = { arguments:InputType -> body}

    //greeter (" Hello guga")
    /*val greeter: (String) -> String = { name: String-> "Hello $name" }
    val greeting = greeter("guga")
    println(greeting) //printing Hello guga
    */


    //"Hello GUGA padilha"
    val greeterLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val modifiedFirstName: String = firstName.toUpperCase()
        val modifiedLastName: String = lastName.toLowerCase()
        "Hello $modifiedFirstName $modifiedLastName"
    }

    val greetingLambda: String = greeterLambda("guga", "padilha")
    println(greetingLambda)

    //LAMBDA IT PARAMETER

    repeat(10) { println("this is interation $it")}

    repeat(10) {index: Int -> //i can pass like this as well
        println("this is interation $index")
    }




    //LAMBDA FUNCTION AS A FUNCTION PARAMETER

    lineLogger {
        println("message 1")
        println("message 2")
        println("message 3")
    }
}

    fun lineLogger(block: () -> Unit) { //lambdaName is block, () is the inputType, Unit is the ReturnType

        repeat(5) { println("--------")}
        block() //the block is the block of code for lineLogger
        repeat(5) { println("--------")}
    }