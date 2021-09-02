fun main () {

    val listOfStrings = listOf<String>("guga", "john", "mary")
    val listOfInts = listOf<Int>(1, 2, 3, 4, 5)

    val result = EvenList(listOfStrings)
    println(result.items())

    val otherResul = EvenList(listOfInts)
    println(otherResul.items())

    val people = listOf<Names>(
        Names("Guga"), //0
        Names("Bob"),  //1
        Names("Ryan"), //2
        Names("Ronan") //3
    )
    println(EvenList(people).items())
}

class EvenList<T>(val list: List<T>) { //T of TYPE, i can write whatever i want, and works as well
    fun items(): List<T> {
        return list.filterIndexed() {index, value -> index % 2 == 0} //i dont speccify what type i can do this
                                                                     //but i could do to string or int as well
    }
}