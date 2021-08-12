fun main () {
    val user = Users("Foo", "Bar")
    Users.MAX_AGE //posso acesar, pois esta dentro do companion object

    Constanst.MIN_AGE
}

class Users(var firstName: String, var lastName: String) {

    companion object {
        const val MAX_AGE = 18 //this conts cannot be private, otherwise i cannot access on main
    }

    fun fullName(): String = "$firstName - $lastName"

    override fun toString(): String {
        return fullName()
    }
}


object Constanst { //its a singleton, cause i create a object
    const val MAX_AGE = 18
    const val MIN_AGE = 5
}