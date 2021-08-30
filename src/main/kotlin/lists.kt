fun main () {
    //FILTER IMUTABLE LISTS

    val names: List<String> = listOf("guga", "bob", "john", "isaias", "zeck", "hugo")
    //val filtered: List<String> = names.filter { it != "guga" } print all names, but not guga
    val filtered: List<String> = names.filter { it.toLowerCase().contains("a") }
    println(filtered)

    val ages = listOf(23, 22, 19, 54, 6, 9, 19)
    //val adults = ages.filter { it >= 18 } //i can pass the value directly
    val adults: List<Int> = ages.filter(::isAdult) //or i can call the fun isAdult
    println(adults)


    //FIND ITEM IN LIST - if contains parts of string, will return de currently string

    val result = names.lastOrNull {(it.toLowerCase().contains("hug"))}
    println(result)


    //FILTER NOT IN LIST - if not contains the letter, then will print these string's

    val aList = names.filterNot { it.contains("a") }
    println(aList)


    //CREATE A NEW LIST FROM A EXISTING LIST - printing the names without letter a from the 2 lists

    val aproved: MutableList<String> = mutableListOf("Daniele", "Paul") //has to be a mutable list.

    names.filterTo(aproved,){ it.contains("a")}
    println(aproved)
    println("#######")


    //FLATTEN A LIST (OR AN ARRAY) - to bring together a lot of lists to the unic one

    //LISTOF
    val mine = listOf<String>("Apples, Grapes")
    val theirs = listOf<String>("Oranges", "Pears", "Strawberries")
    val others = listOf<String>("Kiwi, Watermelon")
    val allOfUs: List<List<String>> = listOf(mine, theirs, others)

    println(allOfUs)
    println(allOfUs.flatten())
    println("#######")

    //ARRAYOF
    val mineArray = arrayOf<String>("Apples", "Grapes")
    val theirsArray = arrayOf<String>("Oranges", "Pears", "Strawberries")
    val othersArray = arrayOf<String>("Kiwi, Watermelon")
    val allArrays: Array<Array<String>> = arrayOf(mineArray, theirsArray)

    println(allArrays)
    println(allArrays.flatten())
    println("#######")

    //I CAN COMBINE MULTIPLE IMMUTABLE LISTS TOO
    val resultado = mine.plus(theirs).plus(others)
    println(resultado)

    println(resultado.minus(theirs))
    println(resultado.minus("kiwi".toLowerCase()))


    //UNION OPERATOR - AGROUPH LIST WITHOUT REPEAT THE SAME NAMES

    val peopleList = listOf<DifferentPerson>(
        DifferentPerson("Guga"),
        DifferentPerson("Donn"),
        DifferentPerson("John"),
        DifferentPerson("Lucrecia")
    )

    val morePeopleList = listOf<DifferentPerson>(
        DifferentPerson("Guga"),
        DifferentPerson("Deniels"),
        DifferentPerson("Donn"),
        DifferentPerson("John"),
        DifferentPerson("Isaias")
    )

    val uniqueValues: Set<DifferentPerson> = peopleList.union(morePeopleList).union(listOf(DifferentPerson("Donn")))
    println(uniqueValues) //if i try to add a new value that already exist, they not gonna repeat as well



    //ITERATE OVER A LIST WITH AN INDEX FOREACHINDEX

    peopleList.forEachIndexed { index, differentPerson ->
        println("Index: $index, DifferentPerson: $differentPerson")
    }
}

fun isAdult(value: Int): Boolean {
    return value >= 18
}

data class DifferentPerson(var name: String)


