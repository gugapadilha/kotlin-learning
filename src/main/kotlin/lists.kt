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
}

fun isAdult(value: Int): Boolean {
    return value >= 18
}