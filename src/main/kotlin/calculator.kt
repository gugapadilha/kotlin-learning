//SYMPLE CALCULATOR ATT

fun main () {
    println("Please enter an arithmetic problem... ")
    println("If you want to leave just press enter twice")
    var input = readLine()

    while (input != null && input.isNotBlank()){ //when write enter(a blank value) the program stop

        val values = input.split(" ")

        if(values.size < 3) {
            println("Invalid input. Expected: value + value. Received: $input")
        }else {
            val operator = values[1]
            val lhs = values[0].toDoubleOrNull() ?: throw IllegalArgumentException("Invalid input: ${values[0]}") // left hand size
            val rhs = values[2].toDoubleOrNull() ?: throw IllegalArgumentException("Invalid input: ${values[1]}") // right hand size

            val result = when (operator) { //i create a val for lhs and rhs, so i dont need to set the [] for each one
                "+" -> lhs + rhs
                "-" -> lhs - rhs
                "*" -> lhs * rhs
                "/" -> lhs / rhs
                else -> throw IllegalArgumentException("Invalid operator: $operator")
            }
            println(result) //resul is refering for anyone of this operators to print
        }
        input = readLine()
    }
    println("See you nex time!")
}
