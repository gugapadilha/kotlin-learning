import com.shreks.Person2

fun main () {

    var personObj = Person()
    personObj.name = "guga"
    personObj.display(personObj.name) //codigo roda normalmente apenas com o personObj.display()

    var personObj2 = Person2("Agustinho Carrara")
    personObj2.display()
}

class Person {

    var name: String = "" //precisa ser var, pois mudo a string vazia para o valor "guga"

    fun display(name: String){ //codigo roda normalmente apenas com o display()
        println(name)
    }
}



