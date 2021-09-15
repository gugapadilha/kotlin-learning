fun main () {

    val program = Programs()
    program.reverseAndDisplay("hello", {it.reversed()})


    var person = Pessouan()

    person.apply {
        name = "guga"
        age = 19
    }.startRun()

    println(person.name)
    println(person.age)
}

class Programs {

    fun reverseAndDisplay(str: String, myFunc: (String) -> String) { //High Level Function with lambda as parameter
        var result = myFunc(str) //it.reversed() =====> str.reversed =====> "hello".reversed() = "olleh"
        println(result)
    }
}

class Pessouan {

    var name: String = ""
    var age: Int = 0

    fun startRun() {
        println("now i'm ready to run")
    }
}