import NewUser.Companion.users

fun main () {

   val user =  NewUser.createUser("foo", "bar")
    println(user)

    val users = NewUser.creatUsers(5)
    println(users)
    users.forEach{ println(it)}

}

class NewUser(var firstName: String, var lastName: String) {

    companion object {

        val users = mutableListOf<NewUser>()

        fun creatUsers(count: Int): List<NewUser>{
            for(i in 0..count){
                users.add(NewUser("FirstName${i}", "LastName${i}"))
            }
            return  users
        }

        fun createUser(firstName: String, lastName: String): NewUser{
            return NewUser(firstName, lastName)
        }
    }

    fun fullName(): String = "$firstName - $lastName"

    override fun toString(): String {
        return  fullName()
    }
}