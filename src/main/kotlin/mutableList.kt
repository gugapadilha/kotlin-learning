fun main () {

    //MUTABLES LISTS

    val items = mutableListOf(1, 2, 3, 4, 5)
    items.forEach { println(it) }

    println("######")

    val guga = NewUsuarios("guga", "padilha")
    val items2 = mutableListOf(
        guga,
        NewUsuarios("augustinho", "carrara")
    )
    items2.forEach { println(it) }

    println("######")

    items2.remove(guga) //removing the var guga from the items2.
    items2.forEach { println(it) }

    println("######")

    items.add(6)
    items.remove(3) //remove the item in the list
    items.removeAt(0) //remove in the 0 position
    items.forEach { println(it) }

}