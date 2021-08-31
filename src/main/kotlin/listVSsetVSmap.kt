fun main () {

    //List
    val list = listOf<String>("Donn", "Tushar", "Kavita", "Evelyn", "Felicia")

    //Set
    val set = setOf<String>("Donn", "Tushar", "Donn", "Tushar")
    //will only include Donn, Tushar once each

    //Map: Key Value pairs // key -> string | value -> string
    val map = mapOf<String, String>("Donn" to "Felker", "Tushar" to "Muhaj", "Evelyn" to "Smith")
    //i can have different operators in the same map
    val map2 = mapOf<Peooplee, Int>(Peooplee("guga") to 1, Peooplee("john") to 2)

    //Sequence
    val sequence = sequenceOf(1, 2, 3, 4, 5)
    //when you need perfomance  | can transform list and map in sequences to
    list.asSequence() //transform a list to a sequence
    sequence.toList() //untransform a list to a sequence
    map.asSequence()  //transform a map to a sequence
    sequence.toList() //untransform a map to a sequence
}

data class Peooplee(val name: String)