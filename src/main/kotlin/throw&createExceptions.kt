import java.lang.IllegalArgumentException

fun main () {

//    //THROW EXCEPTION
//    val p = NomeIdade("guga", 19)
//
//    if(p.age < 21) {
//        throw Exception("cannot drink alcahol")
//    }


    //CREATE A CUSTOM EXCEPTION
    val p2 = NomeIdade("resters", 19)

    if(p2.age < 21) {
        throw InvalidAgeException(p2.age, "User is not old enough")
    }
    

}

data class NomeIdade(var name: String, var age: Int)

class InvalidAgeException(val age: Int, message: String): IllegalArgumentException("Invalid age: $age, $message")