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
}

class PersonNames(val name:String)