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
    
    
    //SET DATA STRUCTURE (LIST WITH NO DUPLICATES)

    val names = mutableSetOf<String>("Guga", "Donn", "Matilda") //by efault is immutable too, like list and arrays.
    println(names)

    names.add("Jenny")
    println(names)

    names.add("Guga")
    println(names) //doesnt add because Guga already exist in that setOf


    val newPeople = setOf<Names>(
        Names("Donn"),
        Names("Donn"),
        Names("Margaret")
    )
    println(newPeople) //doesnt repeat the same name cause i'm using data class, else would return 2 different objects.
}

class PersonNames(val name:String)

class ShoppingBag(val items: List<String>)

data class Names(val name: String)