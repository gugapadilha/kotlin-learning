import java.lang.IllegalArgumentException

fun main () {
    val pessoa = NomeIdade("augustinho", 22)

    try {
        checkIdade(pessoa)
        println("After check age") //if age is greater than 21 them this will be printed
    } catch (ex: IllegalArgumentException) { //actuall catch the age and return handled
        println("Handled")
    }finally {
        println("Finally") //uses to clean up things or close variables and stuff.
    }

    println("After try") //program continues
}

private fun checkIdade(pessoa: NomeIdade){
    if (pessoa.age < 21) {
        throw java.lang.IllegalArgumentException("Boom")
    }
}