fun main () {

    val programa = Programa()
    val myLambdaEx: (Int, Int) -> Int = {x:Int, y:Int -> x + y} //Lambda Expression { Function }
    programa.addTwoNumbers(2, 7, myLambdaEx)

    //programa.addTwoNumbers(2, 7, {x, y -> x + y } ) //i can pass directly this way
    //programa.addTwoNumbers(2, 7) {x, y -> x + y }   //i can pass directly this way
}

class Programa {
    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Int) { //High Level Function with lambda as parameter

       val resultado =  action(a, b) //x + y = a + b = 2 + 7 = 9
        println(resultado)
    }
}