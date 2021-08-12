fun main () {
    //Instance - in singleton just have one instance
    println(FavoriteFood.name)
    FavoriteFood.name = "melancia"
    println(FavoriteFood.name)

    FavoriteFood.ingredients.add("Salt")
    println(FavoriteFood.ingredients.first())
    println(FavoriteFood.numberOfIngrdients())

    doStuff() //renamed name to chicken and clear all the ingredients untill now

    println(FavoriteFood.name)
    println(FavoriteFood.ingredients.firstOrNull())
    println(FavoriteFood.numberOfIngrdients())

    println(FavoriteFood === FavoriteFood) //are the same objects
}

fun doStuff() {
    FavoriteFood.name = "chicken"
    FavoriteFood.ingredients.clear()
}

object FavoriteFood {
    var name = "unknow"
    var ingredients = mutableListOf<String>()

    fun numberOfIngrdients(): Int{
        return ingredients.size
    }
}