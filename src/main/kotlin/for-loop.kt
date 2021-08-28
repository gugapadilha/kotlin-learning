fun main () {
    val values = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (number: Int in values) {
        println(number)
    }

    for(i: Int in 1 until 10 step 2){ //i can do reverse: in 10 downTo 1 step 2
       println(i)
    }


    val peoples: List<PeopleNome> = listOf(
        PeopleNome("Guga"),
        PeopleNome("Donn"),
        PeopleNome("John")
    )

    for(human: PeopleNome in peoples ){
        println(human)
    }

}

data class PeopleNome(val name: String)

