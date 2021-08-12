import java.awt.Color

fun main () {
    val user = OnePerson("guga", "padilha")
    user.favoriteCity = "Taboao da serra"
    println(user.toString())

    val color = NewColor("gugapadilha")
    color.favoriteColor = "purple"
    println(color.favColor())

}

class OnePerson (var firstName: String, var lastName: String) {

    lateinit var favoriteCity: String

    fun fullName(): String = "$firstName $lastName"

    override fun toString(): String {
        return fullName() + "'s Favorite City is: $favoriteCity"
    }
}

class NewColor(var nomeCompleto: String) {

    lateinit var favoriteColor: String

    fun allName(): String = "$nomeCompleto"

     fun favColor(): String {
        return allName()+ "'s Favorite color is: $favoriteColor"
    }
}