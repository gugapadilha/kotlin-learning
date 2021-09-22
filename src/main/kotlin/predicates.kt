fun main () {
    val myNumbers = listOf(2, 3, 4, 23, 90) //my numbers is actually the "it"

    //val myPredicate = {num: Int -> num > 10} //or i just can replace "it > 10" for myPredicate in the other checks


    val check1 = myNumbers.all { it > 90 } //are all elements greater than 10, IF (YES) = TRUE, IF (NOT) = FALSE
    println(check1)


    val check2 = myNumbers.any( { it > 10 }) //does any of these elements satisfy the predicate?
    println(check2)


    val check3 = myNumbers.count({ it > 10 }) //number of elements that satisfy the predicate
    println(check3)


    val check4 = myNumbers.find { it > 10 } //returns the first number that matches the predicate
    println(check4)
}