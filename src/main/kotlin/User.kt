class User { //exportando para o classes.kt

    var firstName: String = ""
    var lastName: String = ""
    var idade: Int = 0

    fun printFullName() {
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix: String) {
        println("$prefix $lastName")
    }

    fun updateName(newName: String) {
        firstName = newName //mudando o primeiro nome passado na fun main
    }

    fun updateLastName(newLastName: String) {
        lastName = newLastName
    }

    fun lengthFirstName() {
        println(firstName.length)
    }

    fun mostrarIdade(Idade: Int){
        println("a sua idade é: $idade")
    }
}