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
}