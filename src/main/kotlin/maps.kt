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


    //CREATE A MAP

    val states = mapOf<String, String>(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California"
    )

    //val result: String? = states.get("NY") //if doesnt exist, will return "null" by default
    val result: String = states.getOrDefault("FL", "Unknown Value")
    println(result)


    //MUTABLE MAP
    var newItems = mutableMapOf<String, String>(
        "GU" to "Guga",
        "RA" to "Rafaela",
        "MA" to "Matheus"
    )

    newItems.put("CA", "Carol")
    println(newItems)

    newItems.putIfAbsent("GU", "Gustavo") //if already contains gu, them will print the existed one
    println(newItems)                     //else, will create a new name in that list.

    newItems.remove("RA")
    println(newItems)

    newItems.getOrPut("BE", {"Bernardo"}) //saying to get the key BE, but if isnt in the list
    println(newItems)                         //them simply will return the actuall name Bernardo


}

class PersonNames(val name:String)

class ShoppingBag(val items: List<String>)

data class Names(val name: String)