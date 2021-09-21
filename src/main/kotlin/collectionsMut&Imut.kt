fun main () {

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