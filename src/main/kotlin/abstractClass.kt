fun main () {
    //Classes can be ABSTRACT in nature
    //The Role of ABSTRACT class is to just provide set of methods and properties
    //Abstract Class are Partially defined class
    //Abstract Methods have no body when declared
    //Abstract Property cannot be initialized when declared

    //You cannot create instance/objects of ABSTRACT class
    //You need to override ABSTRACT methods, properties inside Derived class
}

abstract class Persona { //You cannot create instance of abstract class

    // abstract var name: String //if was abstract i can't pass the value right here. I just define.
    open var name:String = "guga"

    abstract fun eat()      //Abstract properties are "open" by default
    open fun getHeight() {} //A "open" function ready to be overriden
    fun goToSchool() {}     //Normal Function: public and final by default
}

class Brazilian: Persona () { //SUB Class or DERIVED class

    override var name: String = "guga_brazilian_name" //value overrited inside Brazilian class

    override fun eat(){

    }

    fun getHeigth() {

    }
}