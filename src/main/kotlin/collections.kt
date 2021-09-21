fun main () {

    //Elements:  32   0    0    54   0
    //index:     0    1    2    3    4

    var myArray = Array<Int>(5) { 0 } //mutable but fixed size
    myArray[0] = 32
    myArray[3] = 54

    for (element in myArray) { //using individual element (objects)
        println(element)
    }

    println()

    for (index in 0..myArray.size -1 ) { //i can use index in 0..4 as well, is the same thing
        println(myArray[index]) //printing all the elements inside de array
    }


    //MUTABLE

    var list =  mutableListOf<String>("yogi", "mario", "luigi") //mutable, no fixed size, cann add or remove elemnts
    list.add("princess")
    list.add("zelda")

    list.remove("princess")
    list.add(3, "bakugan")

    //list[3] = "digimon" //replace in the 3

    for (index in 0..list.size - 1) {
        println(list[index])
    }
}