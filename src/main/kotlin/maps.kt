fun main () {

    val items = listOf<String>("Donn Felker", "Guga Padilha", "Augustinho Carrara", "Peter Parker")

    //MAP OPERATOR IN A LIST

    val abbreviation = items.map { it.substring(0, 3).toUpperCase() }
                        .filterNot { it.contains("O") } //can add multiples prop and methods in the same map
                        .reversed() //will reverse the names of the array in contrary order
    println(abbreviation)


    val people = listOf<PersonNames>(
        PersonNames("Yoda"),
        PersonNames("Brtt"),
        PersonNames("4Lan"),
        PersonNames("Axt")
    )

    val peopleResult = people.map { it.name }.map { it.length }
    println(peopleResult)
    
    
    //MAP VS FLATMAP

    val groceryBags = listOf<ShoppingBag>(
        ShoppingBag(listOf("Grapes", "Apples", "Oranges")),
        ShoppingBag(listOf("Milk", "Eggs", "Pasta")),
        ShoppingBag(listOf("Bread", "Naan", "Cake")),
    )

    val retailBags = listOf<ShoppingBag>(
        ShoppingBag(listOf("Shirts", "Pants", "Trouser")),
        ShoppingBag(listOf("Socks", "Shoes")),
        ShoppingBag(listOf("Jacket", "Sweater", "Scarf")),
    )

    val groceries = groceryBags.flatMap { it.items }
    println(groceries) //normally uses when u have a list of a list and want to print all together

    val clothes = retailBags.map { it.items }
    println(clothes)
}

class PersonNames(val name:String)

class ShoppingBag(val items: List<String>)