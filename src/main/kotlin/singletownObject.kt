fun main () {
    //singletown is when we have just one instance of a class in a whole application.

    CustomersData.count = 98
    CustomersData.typeOfCostumers()

    println(CustomersData.count)
    CustomersData.count = 110
    println(CustomersData.count)

    CustomersData.myMethod("hello")
}

 open class MySuperClass {

     open fun myMethod(str: String){
        println("MySuperClass")
    }
}

object CustomersData: MySuperClass() {
    var count: Int = -1 //behaves like static variable
    
    fun typeOfCostumers(): String { //behaves like static methods
        return "Brazilian"
    }

    override fun myMethod(str: String){ //currently, behaving like static method
        super.myMethod(str)
        println("Object CustomerData: "+ str)
    }

    init {
        println("Hello there")
    }
}