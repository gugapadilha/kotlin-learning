fun main () {

    val newUser = AnUser("guga", "padilha", 19)

    when {
        newUser.name == "guga" && newUser.lastName == "padilha" -> {
            println("this is guga")
        }
        newUser.name == "dan" -> {
            println("this is dan")
            println("abc")
        }
        else -> println("this is not guga")
    }

     when {
         newUser.age == 20 -> {
             println("you're 20")
         }
         else -> {
             println("you're not 20")
         }
     }

    /*
    when (newUser.name) {
        "guga" -> {
            println("this is guga")
        }
        else -> {
            println("this is not guga")
        }
    }*/

    // ITS THE SAME THING
/*
    if(newUser.name == "guga"){
        println("this is guga")
    }else {
        println("this is not guga")
    }
*/
}

class AnUser(var name: String, var lastName: String, var age: Int)

