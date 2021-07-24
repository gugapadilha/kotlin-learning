fun main () {

    var personObj = Person()
    personObj.name = "guga"
    personObj.display(personObj.name) //codigo roda normalmente apenas com o personObj.display()

    var personObj2 = Person2()
    personObj2.name2 = "Agustinho Carrara"
    println("The name of the person is ${personObj2.name2} ")
}

class Person {

    var name: String = "" //precisa ser var, pois mudo a string vazia para o valor "guga"

    fun display(name: String){ //codigo roda normalmente apenas com o display()
        println(name)
    }
}

class Person2 {

    var name2:String = ""
}
