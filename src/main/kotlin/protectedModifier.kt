fun main () {
    val p = Pessoals("guga", 19) //cannot set the favorite food in Pessoals cause is protected
    val c = Chef("bob", 30, "ribs")

    p.showsMyFavoriteFood() // i can just show the favorite food

    c.showsMyFavoriteFood()
    c.setMyFavoriteFood("Onions")
    c.showsMyFavoriteFood()
}

open class Pessoals(var name: String, var age: Int) {
    protected var favoriteFood: String = "unknown"

    fun info () {
        println("this person's name is $name and they are $age yo")
    }

    fun showsMyFavoriteFood() {
        println(favoriteFood)
    }
}

class Chef(name: String, age: Int, favFood: String): Pessoals(name, age){
    init {
        favoriteFood = favFood
    }
    fun setMyFavoriteFood(food: String){
        favoriteFood = food
    }
}