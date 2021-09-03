import java.lang.IllegalArgumentException

fun main () {

//    //THROW EXCEPTION
//    val p = NomeIdade("guga", 19)
//
//    if(p.age < 21) {
//        throw Exception("cannot drink alcahol")
//    }


//    //CREATE A CUSTOM EXCEPTION
//    val p2 = NomeIdade("resters", 19)
//
//    if(p2.age < 21) {
//        throw InvalidAgeException(p2.age, "User is not old enough")
//    }

    
    //TRY CATCH STATEMENT
    val p3 = NomeIdade("gugaran", 16)

    try {
        checkAge(p3)
        println("Done")
        println("Done")
        println("Done")
        println("Done")
        println("Done")
    } catch(ex: Exception) {
        when (ex) {
            is InvalidAgeMultipleExceptions -> println("Invalid age")
            is java.lang.IllegalArgumentException -> println("Illegal Argument")
            else -> println("Something else")
        }
        println("Caught the exception") //the application will not CRASH.
        //if something goes wron with apllication, the program will print that
    }
}
//  //CATCH ONLY ONE EXCEPTION
//    private fun checkAge(p3: NomeIdade) {
//    if(p3.age < 18) {
//        throw Exception("FOO")
//    }
//    println("after catch that")
//}


//    //CATCH MULTIPLE EXCEPTION
private fun checkAge(p3: NomeIdade) {
    if(p3.age < 18) {
        throw InvalidAgeMultipleExceptions("BOOM")
    }
    println("after catch that")
}

data class NomeIdade(var name: String, var age: Int)

class InvalidAgeException(val age: Int, message: String): IllegalArgumentException("Invalid age: $age, $message") //use that in single

class InvalidAgeMultipleExceptions(message: String): IllegalArgumentException(message) //use that in multiple
