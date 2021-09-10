fun main () {

    val program = Program()

    program.addTwoNumbers(2, 7) //THATS A SIMPLE WAY TO DO IT


    program.addTwoNumbers(2, 7, object: MyInterface{ //using interface / object oriented way
        override fun execute(sum: Int) {
            println(sum)
        }
    })


    val myLambda: (Int) -> Unit = { s: Int -> println(s) } //lamba expression {function}
    program.addTwoNumbers(2, 7, myLambda)
}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) { //high level function with lambda as parameter

        val sum = a + b
        action(sum)
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) { //using interface / object oriented way

        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int) { //THATS A SIMPLE WAY TO DO IT
        val sum = a + b
        println(sum)
    }

}

interface MyInterface {
    fun execute(sum: Int)
}