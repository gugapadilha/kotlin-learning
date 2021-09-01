fun main () {
    val obj: Any = AnOrder(120)
    if(obj is String) { //Any can be anything, always return it's is - I can pass String,Int,Double... tho
        println("it's is")
    } else {
        println("it's not")
    }


    val obj2: Any = getStuff("1")
    if(obj2 is Any) {
        println("yeah it is")
        println(obj2.javaClass.name)
    }else {
        println("no its not")
        println(obj2.javaClass.name)
    }
}

fun getStuff(value: String): Any {
    return when(value) {
        "1" -> 1
        "2" -> "hello"
        "3" -> true
        "4" -> 16.0
        else -> false
    }
}

data class AnOrder(val amount: Int)
class NamePerson(val name: String)