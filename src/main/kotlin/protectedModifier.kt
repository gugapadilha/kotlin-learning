fun main () {
    val p = Pessoals("guga", 19) //cannot set the favorite food in Pessoals cause is protected
    val c = Chef("bob", 30, "ribs")

    //p.showsMyFavoriteFood() // i can just show the favorite food

    //c.showsMyFavoriteFood()
    c.setMyFavoriteFood("Onions")
    //c.showsMyFavoriteFood()
}

open class Pessoals(var name: String, var age: Int) {

    fun info () {
        println("this person's name is $name and they are $age yo")
    }
}

open class Chef(name: String, age: Int, var favoriteFood: String): Pessoals(name, age){

    protected fun showsMyFavoriteFood() {
        println(favoriteFood)
    }

    fun setMyFavoriteFood(food: String){
        favoriteFood = food
        showsMyFavoriteFood()
    }
}

class SousChef(name: String, age: Int, var favFood: String): Chef(name, age, favFood){

    init { //just can call in init, even if is a protected.I cannos print that on my main
        showsMyFavoriteFood()
    }
}