fun main () {

    //CHECKING TYPE IS
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

    //TYPE CASTING
    val obj3: Any = getStuff("5") //can change this value to print in return what i want to
    val casted: NamePerson = obj3 as NamePerson //i can passa Int / Int OR String / String too.
    println(casted)


    //CASTIGN WITH AS
    val obj4: Any = getStuff("2")
    val casted2: Int? = obj4 as? Int //in this case, it tries to always return a Int - else will return null
    println(casted2)
}

fun getStuff(value: String): Any {
    return when(value) {
        "1" -> 1
        "2" -> "hello"
        "3" -> true
        "4" -> 16.0
        "5" -> NamePerson("guga")
        else -> false
    }

}

data class AnOrder(val amount: Int)
data class NamePerson(val name: String)