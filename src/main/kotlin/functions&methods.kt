fun main () {
     purpleCow()

    val a = newNumber()
    println(a)

    sayHiAndBy()

    doWork(19, "guga", true)
    doWork(25, "yoda", true)
    doWork(60, "brtt", false)

}

//CHAMANDO FUNCOES NA MESMA FUNCAO
fun purpleCow() {
    println("Hello purple cow")
    moo()

}

fun moo() {
    println("Mooo!")
}


//RETURN A VALUE FROM A FUNCTION
fun newNumber(): Int {
    return 32
}


//FUNCOES DENTRO DE FUNCOES

fun sayHiAndBy() {
    println("Hello")

    fun sayBye(){
        println("Bye")

        fun seeU(){
            println("See you")
        }
        seeU()
    }
    sayBye()
}

//FUNCOES ARGUMENTOS

fun doWork(age: Int, name: String, isHappy: Boolean) {
    if(age < 21){
        println("$name, você não é velho o suficiente, você possui $age.")
    }else {
        println("$name, você tem a idade apropriada, você possui $age.")
    }
    println("você esta feliz? $isHappy")
}

