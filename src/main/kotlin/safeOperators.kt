fun main () {

    //1. Safe Call ( ?. )
    //use if you dont mind to return a null value
    //val name: String? = null //will return null
    val name: String? = "guga"
    println("The lenght of name is ${name?.length}")


    //2. Safe Call with let ( ?.let )
    //it executes the block only if name is not null
    name?.let {
        println("The lenght of name is ${name.length}")
    }


    //3. Elvis-operator ( :? )
    //when we have nullable reference 'name', we can say 'is name is not null', use it
    val len = if(name != null){
        name.length
    }else {  //all this 5 lines of code, i can write in simply 1 line of code
        -1
    }

    val aLenght = name?.length ?: -1
    println("The lenght of name is ${aLenght}")
}