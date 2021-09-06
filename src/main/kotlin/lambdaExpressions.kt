fun main () {
    // val lambdaName: (InputType) -> ReturnType = { arguments:InputType -> body}

    //greeter ("guga")
    //"guga padilha"
    val greeter: (String) -> String = { name: String -> "Hello $name" }
    println(greeter("guga"))
}