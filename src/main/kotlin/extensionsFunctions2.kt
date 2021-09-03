fun main () { //GETTING THE METHODS FOR Extensions.kt
    val name: String = "guga padilha"
    println(name.initials())

    val age: Int = 35
    println(age.isAdult())

    val person = PersonHave("guga", "padilha", 19)
    //println("${person.firstName} ${person.lastName}") //instead use that to show de full name
    println(person.fullName()) //i can simply o this because i put together both names on Extension.kt

}
