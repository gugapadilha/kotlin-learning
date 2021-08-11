fun main () {

    var user1 = Pessoal("sam", 10)
    var user2 = Pessoal("sam", 10)

    println(user1)

    if(user1 == user2) {
        println("Equal")
    }else {
        println("Not equal")
    }

    var newUser = user1.copy(nome = "john") //its just possible to use copy when use the data class
    println(newUser)
}

 data class Pessoal (var nome: String, var id: Int){
    //with data class, return equal,because it compares only the values of the var
    //and dont compare de hole object as well.
}