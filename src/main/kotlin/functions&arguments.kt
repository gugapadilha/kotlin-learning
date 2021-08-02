fun main () {
    //CALL FUNCTIONS IN THE SAME FUNCTION
     purpleCow()

    //RETURN A VALUE FROM A FUNCTION
    val a = newNumber()
    println(a)

    //FUNCTIONS INSIDE FUNCTIONS
    sayHiAndBy()

    //ARGUMENT FUNCTION
    doWork(19, "guga", true)
    doWork(25, "yoda", true)
    doWork(60, "brtt", false)

    //NAMED ARGUMENT AND DEFAULT
    userInfo("guga", "padilha", true, 2001)
    //tenho que passar as informações na ordem que escrevi na funcao, caso contrario... escrevo assim
    //defini a var likeMovies como true na fun, então NÃO preciso passar ela, pois todos gostam de filmes
    userInfo(firstName = "Roberto", lastName = "Gonçalves", wasBorn = 2010)
    userInfo(firstName = "Julia", lastName = "X-Burguer", wasBorn = 1972, likeMovies = false) //Julia ñ gosta
    userInfo(firstName = "Augustinho", lastName = "Carrara", wasBorn = 1987)

    //MULTIPLE ARGUMENTS
    bookInfo("green eggs", "gugamel", "marceloD2", "Chimarrutz", "joséRico")

    //OVERLOAD FUNCTION
    userInformation("guga", 19)
    userInformation("john", 34, "blue")
    userInformation("sophia", favColor = "blue")
}

//CALL FUNCTIONS IN THE SAME FUNCTION
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


//FUNCTIONS INSIDE FUNCTIONS

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

//ARGUMENT FUNCTION

fun doWork(age: Int, name: String, isHappy: Boolean) {
    if(age < 21){
        println("$name, você não é velho o suficiente, você possui $age.")
    }else {
        println("$name, você tem a idade apropriada, você possui $age.")
    }
    println("você esta feliz? $isHappy")
}


//NAMED ARGUMENT AND DEFAULT

fun userInfo(firstName: String, lastName: String, likeMovies: Boolean = true, wasBorn: Int ){
    println("$firstName $lastName like movies: $likeMovies and was born in: $wasBorn")
}


//MULTIPLE ARGUMENTS

fun bookInfo (title: String, vararg authors: String){
    println("$title - Autores: ")
    authors.forEach{ println(it) }
}


//OVERLOAD FUNCTION

fun userInformation(name: String, age: Int = 0, favColor: String = ""){
    println("nome: $name, idade: $age, cor favorita: $favColor")
}