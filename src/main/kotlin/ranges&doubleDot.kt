fun main () {

    //RANGES

    val r1 = 1..5
    //this range contains the number 1, 2, 3, 4, 5

    val r2 = 5 downTo 1
    //this range contains the number 5, 4, 3, 2, 1

    val r3 = 5 downTo 1 step 2
    //this range contains the number 5, 3, 1


    var r4 = 'a'..'c'
    //this range contains the values from "a", "b", "c" ....... "z"

    var isPresent = 'c' in r4
    println(isPresent)


    var countDown = 10.downTo(1)// downTo é o oposto de rangeTo
    //this range contains the number 10, 9, 8, 7, 6 ....... 1

    var moveUp = 1.rangeTo(10) //rangeTo é o oposto de downTo
    //this range contains the number 1, 2, 3, 4, 5 ........10
}