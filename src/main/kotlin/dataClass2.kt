fun main () {

    val p1 = InPerson("guga", "padilha")
    val p2 = InPerson("guga", "padilha")
    val p3 = InPerson()


    println(p1 == p2) //its equals beacause its a dataClass
    println(p3) //shows the default values that i defined on class
    println(p1) //with dataclass shows de actual class, and without data shows a different code
    println(p1.fullName())
    println(p1.lenghtOfName())

    //Undertanding Componnents

    val person1 = InPerson("augustinho", "carrara", 36)
    println(person1.component1())
    println(person1.component2())
    println(person1.component3())

}

//equals / hashcode / toString

data class InPerson //the compponents will be put the order that we write over here.
    (val firstName: String = "firstUnknown", //component1
     val lastName: String = "lastUnknown",   //component2
     val age: Int = 0) {                     //component3

    fun fullName(): String {
        return "$firstName $lastName"
    }
    fun lenghtOfName(): Int {
        return fullName().length
    }
}